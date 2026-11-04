<?php

function callBookApi(
    string $method,
    string $url,
    ?array $payload = null
): array {
    // 1. Initialize cURL session
    $ch = curl_init($url);

    // 2. Set required headers for Lab 6 Content Negotiation
    $headers = [
        'Accept: application/json'
    ];

    // Configure basic options
    curl_setopt($ch, CURLOPT_CUSTOMREQUEST, $method);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

    // If sending data (POST/PUT/PATCH), attach JSON body
    if ($payload !== null) {
        $jsonData = json_encode($payload);
        $headers[] = 'Content-Type: application/json';

        curl_setopt($ch, CURLOPT_POSTFIELDS, $jsonData);
    }

    curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);

    // 3. Execute request and capture response and status code
    $rawResponse = curl_exec($ch);
    $statusCode = curl_getinfo($ch, CURLINFO_HTTP_CODE);
    $curlError = curl_error($ch);

    // 4. Close cURL resource
    //Deperecated in php 8.5
    // curl_close($ch);

    if ($curlError) {
        die("cURL Transport Error: " . $curlError);
    }

    return [
        'status' => $statusCode,
        'body' => json_decode($rawResponse, true)
    ];
}

$baseUrl = "http://localhost/website/api.php/books";

echo "<h1>PHP Server-Side API Client</h1>";

// --- TEST 1: Fetch Available Tolkien Books (GET) ---
echo "<h2>1. Fetching Available Tolkien Books</h2>";

$query = "?author=Tolkien&is_available=1";
$getResponse = callBookApi('GET', $baseUrl . $query);

if ($getResponse['status'] === 200) {
    $meta = $getResponse['body']['metadata'];
    $books = $getResponse['body']['data'];

    echo "<p>Found {$meta['total_items']} matching books ";
    echo "(Page {$meta['current_page']} of {$meta['total_pages']}):</p>";

    echo "<ul>";

    foreach ($books as $book) {
        $title = htmlspecialchars($book['title']);
        $author = htmlspecialchars($book['author']);

        echo "<li><strong>$title</strong> by $author</li>";
    }

    echo "</ul>";
} else {
    echo "<p>Error fetching books!</p>";
}

// --- TEST 2: Triggering a 422 Validation Error (POST) ---
echo "<h2>2. Testing Server-Side Error Handling (Invalid POST)</h2>";

$badPayload = [
    "title" => "A",   // Too short! Lab 6 requires >= 2 chars
    "author" => ""    // Empty!
];

$postResponse = callBookApi('POST', $baseUrl, $badPayload);
$status = $postResponse['status'];

echo "<p>HTTP Status Code Returned: <strong>$status</strong></p>";

if ($status >= 400) {
    $boxStyle = "background:#ffe6e6; border:1px solid red; padding:10px;";
    $errMsg = htmlspecialchars($postResponse['body']['error'] ?? 'Unknown error');

    echo "<div style=\"$boxStyle\">";
    echo "<strong>API Error:</strong> $errMsg<br>";

    if (isset($postResponse['body']['details'])) {
        echo "<ul>";

        foreach ($postResponse['body']['details'] as $field => $issue) {
            $safeField = htmlspecialchars((string) $field);
            $safeIssue = htmlspecialchars((string) $issue);

            echo "<li><strong>$safeField:</strong> $safeIssue</li>";
        }

        echo "</ul>";
    }

    echo "</div>";
}

?>