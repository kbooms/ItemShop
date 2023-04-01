-- Inventory Table Design
CREATE TABLE inventory (
    inventory_id serial,
    inventory_name varchar(50) NOT NULL,
    inventory_type varchar(20),
    inventory_available int,
    inventory_price int,
    CONSTRAINT PK_inventory PRIMARY KEY(inventory_id)
);

