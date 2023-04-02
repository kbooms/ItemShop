-- INSERT into inventory
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Research Materials', 'LORE', 2, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Plant Chemicals', 'PLANTING', 15, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Furniture Dye - Dark Rust', 'DYE', 1, 15000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Facial Hair Dye - Mount Petram', 'DYE', 1, 25000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Carpet Dye - Aegis Keep', 'DYE', 1, 25000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Carpet Dye - Metallic Sky', 'DYE', 1, 25000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Carpet Dye - Metallic Lemon-Lime', 'DYE', 1, 25000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Carpet Dye - Mausoleum', 'DYE', 1, 25000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Runebook Dye - Shimmer Peacock', 'DYE', 1, 7500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Rare Cloth - Aegis Keep', 'CLOTH', 1, 2500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Rare Cloth - Metallic Wine', 'CLOTH', 2, 4000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Random Spell Hue Deed', 'MAGIC', 1, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Fishing Map - Rosescale', 'MAP', 2, 7500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Fishing Map - Shadowscale', 'MAP', 1, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lumber Map - Shadowwoord', 'MAP', 1, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lumber Map - Bronzewood', 'MAP', 1, 6000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lumber Map - Goldenwood', 'MAP', 1, 10000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lumber Map - Avarwood', 'MAP', 1, 50000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Treasure Map - Level 1', 'MAP', 1, 10000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Treasure Map - Level 2', 'MAP', 6, 20000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Treasure Map - Level 3', 'MAP', 2, 30000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Blood Aspect Extract', 'ASPECT', 1, 8000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Command Aspect Extract', 'ASPECT', 2, 45000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Death Aspect Core', 'ASPECT', 3, 4000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Eldritch Aspect Core', 'ASPECT', 3, 15000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Fortune Aspect Core', 'ASPECT', 2, 16000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Holy Aspect Core', 'ASPECT', 1, 4000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Shadow Aspect Core', 'ASPECT', 1, 10000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Water Aspect Core', 'ASPECT', 1, 4000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Void Aspect Core', 'ASPECT', 1, 10000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Camping Skill Scroll', 'SCROLL', 1, 3000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Cooking Skill Scroll', 'SCROLL', 1, 3000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Taste Id Skill Scroll', 'SCROLL', 1, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Tracking Skill Scroll', 'SCROLL', 1, 2500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Tinkering Skill Scroll', 'SCROLL', 1, 9000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lumberjacking Skill Scroll', 'SCROLL', 1, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Animal Taming Skill Scroll', 'SCROLL', 2, 9000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Veteromary Skill Scroll', 'SCROLL', 2, 8000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Cartography Skill Scroll', 'SCROLL', 1, 7500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Begging Skill Scroll', 'SCROLL', 1, 1500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Lockpicking Skill Scroll', 'SCROLL', 1, 12000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Chivalry Skill Scroll', 'SCROLL', 2, 5000)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Necromancy Skill Scroll', 'SCROLL', 1, 2500)
        RETURNING inventory_id;
INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) 
    VALUES ('Poisoning Skill Scroll', 'SCROLL', 1, 10000)
        RETURNING inventory_id;
        