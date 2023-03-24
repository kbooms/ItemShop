-- ORDERS TABLE
CREATE TABLE orders (
    order_id serial,
    customer varchar(25) NOT NULL,
    is_delivered boolean NOT NULL,
    total_sale int NOT NULL,
    items_cart text[] NOT NULL,
    CONSTRAINT PK_orders PRIMARY KEY(order_id)
);

