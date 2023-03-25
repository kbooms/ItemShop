INSERT INTO orders (customer, is_delivered, total_sale, items_cart)
    VALUES ('Kevin the Bard', true, 70, '{"Heal Potion", "Heal Potion", "Broadsword"}')
        RETURNING order_id;

INSERT INTO orders (customer, is_delivered, total_sale, items_cart)
    VALUES ('Guy the Psychic', false, 3000 '{"Magic Tab", "Magic Tab", "Arcane Scroll"}')
        RETURNING order_id;

INSERT INTO orders (customer, is_delivered, total_sale, items_cart)
    VALUES ('Morgain Le Fay', false, 545, '{"Ether", "Heal Potion", "Magic Tab", "Adventurers Rope"}')
        RETURNING order_id;