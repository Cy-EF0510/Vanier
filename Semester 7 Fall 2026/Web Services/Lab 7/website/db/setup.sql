-- MariaDB / InnoDB. Select an empty local database named a1_equipment_v2 first.
-- Run this file once. The PHP service must use this table as its storage.
CREATE TABLE items (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    category VARCHAR(16) NOT NULL,
    CONSTRAINT ck_item_category CHECK (category IN ('camera','audio','accessory'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
