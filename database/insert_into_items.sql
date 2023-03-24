INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Heal Potion', 'POTION', 10, 'Restores HP')
		RETURNING item_id;
        
INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Cure Potion', 'POTION', 10, 'Cures Poison')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Ether', 'POTION', 10, 'Restores MP')
		RETURNING item_id;
        
INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Medical Herb', 'MAGIC', 5, 'Eliminates Disease')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Fenix Down', 'MAGIC', 50, 'Revives Ally')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Power Tab', 'MAGIC', 500, 'Increases Strength')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Magic Tab', 'MAGIC', 500, 'Increases Magic Power')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Speed Tab', 'MAGIC', 500, 'Increases Agility')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Broadsword', 'WEAPON', 50, 'A basic sword')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Hand axe', 'WEAPON', 40, 'A hand held axe')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Wooden Bow', 'WEAPON', 40, 'It fires arrows')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Bastard Sword', 'WEAPON', 100, 'A large sword with a long blade')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Elven Bow', 'WEAPON', 150, 'A fine bow of brilliant crafstmanship')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Smith Hammer', 'TOOL', 20, 'Used for blacksmithing')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Saw', 'TOOL', 20, 'Used for carpentry')
		RETURNING item_id;

INSERT INTO item (item_name, item_type, item_value, item_desc)
	VALUES ('Mortar & Pestle', 'TOOL', 20, 'Used for alchemy')
		RETURNING item_id;


-- SELECT * FROM items;