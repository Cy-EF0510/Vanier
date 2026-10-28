const API_URL = "http://localhost/website/api.php/books";
let currentPage = 1;
const limit = 4; // 4 items per page
let currentAuthorFilter = "";
// Helper to display error or success messages in the UI
function showFeedback(message, isError = true, detailsObj = null) {
    const box = document.getElementById("feedbackBox");
    box.style.display = "block";
    box.className = isError ? "box error-box" : "box success-box";
    let html = `<strong>${message}</strong>`;
    if (detailsObj) {
        html += "<ul>";
        for (const [field, issue] of Object.entries(detailsObj)) {
            html += `<li><strong>${field}:</strong> ${issue}</li>`;
        }
        html += "</ul>";
    }
    box.innerHTML = html;
}
// 1. Fetch Paginated & Filtered Collection
async function loadBooks() {
    try {
        // Build URL with Query Parameters
        let url = `${API_URL}?page=${currentPage}&limit=${limit}`;
        if (currentAuthorFilter !== "") {
            const encoded = encodeURIComponent(currentAuthorFilter);
            url += `&author=${encoded}`;
        }
        const response = await fetch(url, {
            method: "GET",
            headers: { Accept: "application/json" },
        });
        const result = await response.json();
        if (!response.ok) {
            showFeedback(result.error || "Failed to load books", true);
            return;
        }
        // Render Table Rows
        const tbody = document.getElementById("bookTableBody");
        tbody.innerHTML = ""; // Clear existing rows
        result.data.forEach((book) => {
            const statusText = book.is_available ? "Available" : "Checked Out";
            const row = `<tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${statusText}</td>
            <td><button onclick="deleteBook(${book.id})">Delete</button></td>
            </tr>`;
            tbody.innerHTML += row;
        });
        // Update Pagination Metadata Controls
        const meta = result.metadata;
        const totalPages = meta.total_pages || 1;
        document.getElementById("pageInfo").innerText =
            `Page ${meta.current_page} of ${totalPages} ` + `(Total: ${meta.total_items})`;
        const prevBtn = document.getElementById("prevBtn");
        const nextBtn = document.getElementById("nextBtn");
        prevBtn.disabled = meta.current_page <= 1;
        nextBtn.disabled = meta.current_page >= meta.total_pages;
    } catch (networkError) {
        showFeedback("Network error: Could not reach the API server.", true);
    }
}
// Pagination and Filter UI Handlers
function changePage(direction) {
    currentPage += direction;
    loadBooks();
}
function applyFilter() {
    const input = document.getElementById("filterAuthor");
    currentAuthorFilter = input.value.trim();
    currentPage = 1; // Always reset to page 1 when filtering!
    loadBooks();
}
function resetFilter() {
    document.getElementById("filterAuthor").value = "";
    currentAuthorFilter = "";
    currentPage = 1;
    loadBooks();
}
// Load initial data when page opens
loadBooks();

const bookForm = document.getElementById("addBookForm");
bookForm.addEventListener("submit", async function (event) {
    event.preventDefault(); // Stop page reload
    const titleEl = document.getElementById("bookTitle");
    const authorEl = document.getElementById("bookAuthor");
    const availEl = document.getElementById("bookAvailable");
    const title = titleEl.value.trim();
    const author = authorEl.value.trim();
    const isAvailable = availEl.checked;
    // 1. Client-Side Input Validation
    const clientErrors = {};
    if (title.length === 0) {
        clientErrors.title = "Please enter a book title (Client Check).";
    }
    if (author.length === 0) {
        clientErrors.author = "Please enter an author name (Client Check).";
    }
    // If client validation fails, stop immediately and show errors!
    if (Object.keys(clientErrors).length > 0) {
        showFeedback("Client-Side Validation Failed", true, clientErrors);
        return;
    }
    // 2. Send POST Request to Web Service
    try {
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                Accept: "application/json",
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                title: title,
                author: author,
                is_available: isAvailable,
            }),
        });
        const result = await response.json();
        // 3. Handle Backend API Errors (e.g., 422 Unprocessable Entity)
        if (!response.ok) {
            const errMsg = `Server Error (${response.status}): ${result.error}`;
            showFeedback(errMsg, true, result.details || null);
            return;
        }
        // 4. Success! Clear form, show message, and refresh table
        showFeedback(`Success! Book created with ID: ${result.id}`, false);
        bookForm.reset();
        loadBooks(); // Refresh the table automatically
    } catch (error) {
        showFeedback("Network failure while submitting form.", true);
    }
});

// 8. Delete Book Function
async function deleteBook(id) {
    try {
        const response = await fetch(`${API_URL}/${id}`, {
            method: "DELETE",
            headers: {
                Accept: "application/json",
            },
        });

        const result = await response.json();

        if (!response.ok) {
            const errMsg = `Server Error (${response.status}): ${
                result.error || "Failed to delete book."
            }`;

            showFeedback(errMsg, true, result.details || null);
            return;
        }

        showFeedback("Book deleted!", false);
        loadBooks();

    } catch (error) {
        showFeedback("Network failure while deleting book.", true);
    }
}
