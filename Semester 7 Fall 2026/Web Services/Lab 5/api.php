<?php
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
        //Query the database
        $stmt = $pdo->query('SELECT * FROM books');
        $books = $stmt->fetchAll();

        //Return results as JSON
        http_response_code(200);
        echo json_encode($books);
    } elseif ($method === 'POST') {

        // Read and decode the input
        $rawJson = file_get_contents('php://input');
        $input = json_decode($rawJson, true);

        // Basic Validation: Ensure fields exist
        if (!isset($input['title']) || !isset($input['author'])) {
            http_response_code(400); // 400 Bad Request
            echo json_encode(["error" => "Missing title or author"]);
            exit;
        }

        // Use Prepared Statements to prevent SQL injection!
        $sql = "INSERT INTO books (title, author) VALUES (:title, :author)";
        $stmt = $pdo->prepare($sql);

        // Execute by binding the parameters safely
        $stmt->execute([
            'title' => $input['title'],
            'author' => $input['author']
        ]);

        // Respond with success and the new ID
        http_response_code(201); // 201 Created
        echo json_encode([
            "message" => "Book created successfully",
            "id" => $pdo->lastInsertId()
        ]);
    }

    // ... (Right below the closing bracket of your first routing block)
    // Check if URI matches the pattern /api.php/books/{id}
    // The ([0-9]+) captures the numerical ID into the $matches array.
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

} else {
    // 4. Handle 404 Not Found for unknown URIs
    http_response_code(404);

    echo json_encode([
        "error" => "Endpoint not found"
    ]);
}
