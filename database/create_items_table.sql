CREATE TABLE item (
    item_id serial,
    item_name varchar(50) NOT NULL,
    item_type varchar(20),
    item_value int,
    item_desc varchar(255), 
    CONSTRAINT PK_item PRIMARY KEY(item_id)
);