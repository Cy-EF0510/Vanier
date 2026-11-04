-- MariaDB / InnoDB. Select an empty local database named a1_equipment_v2 first.
-- Run this file once. The PHP service must use this table as its storage.
CREATE TABLE items (
CREATE TABLE books (
id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(255) NOT NULL,
author VARCHAR(255) NOT NULL,
is_available BOOLEAN DEFAULT TRUE
);
INSERT INTO books (title, author) VALUES ("1984", "George Orwell");
INSERT INTO books (title, author) VALUES ("Dune", "Frank Herbert");
INSERT INTO books (title, author, is_available) VALUES
('The Hobbit', 'J.R.R. Tolkien', 1),
('The Fellowship of the Ring', 'J.R.R. Tolkien', 0),
('The Two Towers', 'J.R.R. Tolkien', 1),
('The Return of the King', 'J.R.R. Tolkien', 1),
('Foundation', 'Isaac Asimov', 1),
('I, Robot', 'Isaac Asimov', 0),
('Brave New World', 'Aldous Huxley', 1),
('Fahrenheit 451', 'Ray Bradbury', 1);
