<?php
// Database Configuration
$host = '127.0.0.1';
$db = 'a1_equipment_v2';
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

$validCategories = ["camera", "audio", "accessories"];


// 3. Basic Routing Logic
if ($uri === '/api/v1.php/items') { //todo

    if ($method === 'GET') { //todo
        $category = $_GET['category'] ?? null;
        $page = $_GET['page'] ?? 1;
        //checks if the category exists
        if ($category !== null && !in_array($category, $validCategories, true)) {//allows to not have category
            http_response_code(400);
            echo json_encode(["error" => "Invalid category"]);
            exit;
        }

        $page = filter_var($page, FILTER_VALIDATE_INT); //checks if $page is a valid int

        if($page === false || $page < 1 || $page > 100){//checks if user inputs an invalid page
            http_response_code(400);
            echo json_encode(["error" => "Invalid page"]);
            exit;
        }

        $offset = ($page - 1) * 2; //calculation for the offset where the limit is 2 per page

        //Query the database
        $stmt = $pdo->prepare('SELECT * FROM items 
                                WHERE category = :category OR :category_null IS NULL
                                ORDER BY id ASC 
                                LIMIT :offset , 2');
        $stmt->execute([
            'category' => $category,
            'category_null' => $category,
            'offset' => $offset
        ]);
        $items = $stmt->fetchAll();

        //Return results as JSON
        http_response_code(200);
        echo json_encode(["data" => $items]);
    } elseif ($method === 'POST') {

        // Read and decode the input
        $rawJson = file_get_contents('php://input');
        $input = json_decode($rawJson, true);
        $ogStructure = json_decode($rawJson); //keeps actual json structure

        //check if input is an array
        if (!is_array($input)) {
            http_response_code(400);
            echo json_encode(["error" => "Invalid JSON body"]);
            exit;
        }
        //checks if json is malformed
        if (json_last_error() !== JSON_ERROR_NONE) {
            http_response_code(400);
            echo json_encode(["error" => json_last_error_msg()]);
            exit;
        }
        //checks if json structure is not a json array
        if (!is_object($ogStructure)) {
            http_response_code(400);
            echo json_encode(["error" => "Invalid JSON body"]);
            exit;
        }
        // Basic Validation: Ensure fields exist
        //checks if item name is inputted, is string, and has no spaces at start or end
        if (!isset($input['name']) || !is_string($input['name']) || trim($input["name"]) === "") {
            http_response_code(400); // 400 Bad Request
            echo json_encode(["error" => "Name is required"]);
            exit;
        }
        //checks if name is too long
        if (strlen($input["name"]) > 100) {
            http_response_code(400);
            echo json_encode(["error" => "Name is too long"]);
            exit;
        }

        //checks if user inputted something and is a string
        if (!isset($input['category']) || !is_string($input["category"])) {
            http_response_code(400);
            echo json_encode(["error" => "Category is required"]);
            exit;
        }

        //checks if the category exists
        if (!in_array($input["category"], $validCategories)) {
            http_response_code(400);
            echo json_encode(["error" => "Invalid category"]);
            exit;
        }

        // Use Prepared Statements to prevent SQL injection!
        $sql = "INSERT INTO items (name, category) VALUES (:name, :category)";
        $stmt = $pdo->prepare($sql);

        // Execute by binding the parameters safely
        $stmt->execute([
            'name' => $input['name'],
            'category' => $input['category']
        ]);

        // Respond with success and the new ID
        http_response_code(201); // 201 Created
        echo json_encode([
            "message" => "Item created successfully",
            "id" => $pdo->lastInsertId()
        ]);
    }
} elseif (preg_match('/^\/api\/v1\.php\/items\/([0-9]+)$/', $uri, $matches)) {

    // The ID is captured in $matches[1]
    $itemId = (int) $matches[1];

    if ($method === 'GET') {
        $stmt = $pdo->prepare('SELECT * FROM items WHERE id = :id');
        $stmt->execute(['id' => $itemId]);

        $item = $stmt->fetch();

        if($item === false){
            http_response_code(404);
            echo json_encode(["error" => "Item not found"]);
            exit;
        }

        http_response_code(200);
        echo json_encode($item);
    }
} else {
    // 4. Handle 404 Not Found for unknown URIs
    http_response_code(404);

    echo json_encode([
        "error" => "Page not found"
    ]);
}
