-- Run only in a1_equipment_v2. This replaces all rows in the assignment table.
START TRANSACTION;
DELETE FROM items;
INSERT INTO items (id, name, category) VALUES
(1, 'Mirrorless camera', 'camera'),
(2, 'DSLR camera', 'camera'),
(3, 'USB microphone', 'audio'),
(4, 'Audio recorder', 'audio'),
(5, 'Tripod', 'accessory'),
(6, 'LED light kit', 'accessory'),
(7, 'Action camera', 'camera'),
(8, 'Headphones', 'audio');
COMMIT;
ALTER TABLE items AUTO_INCREMENT = 9;
