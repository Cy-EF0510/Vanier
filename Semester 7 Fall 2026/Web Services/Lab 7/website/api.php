<?php
// --- Execute Pipeline in api.php ---
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header(
    "Access-Control-Allow-Methods: GET, POST, PUT, PATCH, DELETE, OPTIONS"
);
header(
    "Access-Control-Allow-Headers: Content-Type, Accept, Authorization"
);

$method = $_SERVER['REQUEST_METHOD'];

// Handle CORS preflight requests from browsers immediately
if ($method === 'OPTIONS') {
    http_response_code(200);
    exit;
}

function validateBookInput(?array $input): array
{
    $errors = [];

    // 1. Check if JSON decoding failed completely
    if ($input === null) {
        sendError(400, "Malformed JSON payload.");
    }

    // 2. Validate 'title'
    if (!isset($input['title']) || !is_string($input['title'])) {
        $errors['title'] = "Title is required and must be a string.";
    } else {
        $title = trim($input['title']);

        if (strlen($title) < 2 || strlen($title) > 255) {
            $errors['title'] = "Title must be between 2 and 255 characters.";
        }
    }

    // 3. Validate 'author'
    if (!isset($input['author']) || !is_string($input['author'])) {
        $errors['author'] = "Author is required and must be a string.";
    } else {
        $author = trim($input['author']);

        if (strlen($author) < 2 || strlen($author) > 255) {
            $errors['author'] = "Author must be between 2 and 255 characters.";
        }
    }

    // 4. Validate optional 'is_available' if provided
    if (isset($input['is_available']) && !is_bool($input['is_available'])) {
        $errors['is_available'] = "is_available must be a boolean (true or false).";
    }

    return $errors;
}

//Helper function to send standardized JSON error responses
function sendError(int $statusCode, string $message, array $details = []) {
    http_response_code($statusCode);
    $response = [
        "status" => $statusCode,
        "error" => $message
    ];
    if (!empty($details)) {
        $response["details"] = $details;
    }
    echo json_encode($response);
    exit; // Stop execution immediately
}
// Global Exception Handler Middleware
set_exception_handler(function ($exception) {
    // In production, you would log $exception->getMessage() to a file
    // rather than exposing internal database details to the user.
    sendError(500, "Internal Server Error", [
        "debug_message" => $exception->getMessage()
    ]);
});

function runContentNegotiationMiddleware(string $method) {
    // 1. Check the 'Accept' header (What the client wants back)
    $acceptHeader = $_SERVER['HTTP_ACCEPT'] ?? '*/*';
    
    // If client doesn't accept JSON or wildcard (*/*), reject with 406
    if (strpos($acceptHeader, 'application/json') === false &&
        strpos($acceptHeader, '*/*') === false) {
        sendError(406, "Not Acceptable. This API only provides application/json.");
    }
        // 2. Check 'Content-Type' for methods that send a body
        if (in_array($method, ['POST', 'PUT', 'PATCH'])) {
            $contentType = $_SERVER['CONTENT_TYPE'] ?? '';
            
            // If they aren't sending JSON, reject with 415
            if (strpos($contentType, 'application/json') === false) {
                sendError(415, "Unsupported Media Type. Please send application/json.");
        }
    }
}
//--- Execute Pipeline--
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: GET, POST, PUT, PATCH, DELETE");

$method = $_SERVER['REQUEST_METHOD'];
$uri = parse_url($_SERVER['REQUEST_URI'], PHP_URL_PATH);

// Run the middleware!
runContentNegotiationMiddleware($method);

// Database Configuration
$host = '127.0.0.1';
$db = 'library_db';
$user = 'root'; // Update with your DB credentials if different
$pass = ''; // Update with your DB credentials if different
$charset = 'utf8mb4';

// Data Source Name
$dsn = "mysql:host=$host;dbname=$db;charset=$charset";

// PDO Options
$options = [
    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES => false,
];

try {
    $pdo = new PDO($dsn, $user, $pass, $options);
} catch (\PDOException $e) {
    http_response_code(500); // 500 Internal Server Error
    echo json_encode(["error" => "Database connection failed"]);
    exit;
}

// 1. Set headers to allow JSON and handle CORS
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: GET, POST, PUT, PATCH, DELETE");

// 2. Identify the HTTP Method and URI
$method = $_SERVER['REQUEST_METHOD'];
$uri = parse_url($_SERVER['REQUEST_URI'], PHP_URL_PATH);

// 3. Basic Routing Logic
if ($uri === '/website/api.php/books') {


if ($method === 'GET') {
    // 1. Extract Pagination Params (with sensible defaults)
    $page = isset($_GET['page']) ? (int) $_GET['page'] : 1;
    $limit = isset($_GET['limit']) ? (int) $_GET['limit'] : 5;

    // Enforce boundaries (prevent negative numbers or massive limits)
    if ($page < 1) {
        $page = 1;
    }

    if ($limit < 1) {
        $limit = 5;
    }

    if ($limit > 50) {
        $limit = 50; // Max 50 items per page
    }

    $offset = ($page - 1) * $limit;

    // 2. Build Dynamic Filtering (WHERE clauses)
    $whereClauses = [];
    $queryParams = [];

    // Filter by Author (exact or partial match)
    if (!empty($_GET['author'])) {
        $whereClauses[] = "author LIKE :author";
        $queryParams['author'] = "%" . $_GET['author'] . "%";
    }

    // Filter by Availability (0 or 1)
    if (isset($_GET['is_available']) && $_GET['is_available'] !== '') {
        $whereClauses[] = "is_available = :is_available";
        $queryParams['is_available'] = (int) $_GET['is_available'];
    }

    // Combine WHERE clauses if any exist
    $whereSql = "";

    if (count($whereClauses) > 0) {
        $whereSql = "WHERE " . implode(" AND ", $whereClauses);
    }

    // 3. Get Total Count (for metadata)
    $countSql = "SELECT COUNT(*) FROM books $whereSql";
    $countStmt = $pdo->prepare($countSql);
    $countStmt->execute($queryParams);

    $totalItems = (int) $countStmt->fetchColumn();
    $totalPages = (int) ceil($totalItems / $limit);

    // 4. Fetch the Paginated Data
    $dataSql = "SELECT * FROM books $whereSql LIMIT :limit OFFSET :offset";
    $dataStmt = $pdo->prepare($dataSql);

    // Bind filter params
    foreach ($queryParams as $key => $val) {
        $dataStmt->bindValue(":$key", $val);
    }

    // Bind pagination params explicitly as integers
    $dataStmt->bindValue(':limit', $limit, PDO::PARAM_INT);
    $dataStmt->bindValue(':offset', $offset, PDO::PARAM_INT);

    $dataStmt->execute();
    $books = $dataStmt->fetchAll();

    // 5. Return Enveloped Response
    http_response_code(200);

    echo json_encode([
        "metadata" => [
            "total_items" => $totalItems,
            "total_pages" => $totalPages,
            "current_page" => $page,
            "per_page" => $limit
        ],
        "data" => $books
    ]);

} elseif ($method === 'POST') {
    $rawJson = file_get_contents('php://input');
    $input = json_decode($rawJson, true);

    // Run validation
    $validationErrors = validateBookInput($input);

    if (!empty($validationErrors)) {
        // 422 Unprocessable Entity is standard for validation failures
        sendError(422, "Validation Failed", $validationErrors);
    }

    // Sanitize by trimming whitespace
    $title = trim($input['title']);
    $author = trim($input['author']);
    $isAvailable = $input['is_available'] ?? true;

    $sql = "INSERT INTO books (title, author, is_available)
            VALUES (:title, :author, :is_available)";

    $stmt = $pdo->prepare($sql);
    $stmt->execute([
        'title' => $title,
        'author' => $author,
        'is_available' => (int) $isAvailable
    ]);

    http_response_code(201);

    echo json_encode([
        "message" => "Book created successfully",
        "id" => (int) $pdo->lastInsertId()
    ]);
} elseif (preg_match('/^\/website\/api\.php\/books\/([0-9]+)$/', $uri, $matches)) {

    // The ID is captured in $matches[1]
    $bookId = (int) $matches[1];

    if ($method === 'GET') {
        $stmt = $pdo->prepare('SELECT * FROM books WHERE id = :id');
        $stmt->execute(['id' => $bookId]);

        $book = $stmt->fetch();

        http_response_code(200);
        echo json_encode($book);
    } elseif ($method === 'DELETE') {
        $stmt = $pdo->prepare('DELETE FROM books WHERE id = :id');
        $stmt->execute(['id' => $bookId]);

        if ($stmt->rowCount() === 0) {
            http_response_code(404);
            echo json_encode(["error" => "Book not found"]);
            exit;
        }

        http_response_code(200);
        echo json_encode(["message" => "Book deleted successfully"]);
} elseif ($method === 'PATCH') {
    $rawJson = file_get_contents('php://input');
    $input = json_decode($rawJson, true);

    if (!isset($input['is_available'])) {
        http_response_code(400);
        echo json_encode(["error" => "Missing is_available"]);
        exit;
    }

    $sql = 'UPDATE books SET is_available = :status WHERE id = :id';
    $stmt = $pdo->prepare($sql);

    $stmt->execute([
        'status' => $input['is_available'],
        'id' => $bookId
    ]);

    // 5. Return a success message
    http_response_code(200);
    echo json_encode(["message" => "Book availability updated successfully"]);
}
}

} else {
    // 4. Handle 404 Not Found for unknown URIs
    http_response_code(404);

    echo json_encode([
        "error" => "Endpoint not found"
    ]);
}
