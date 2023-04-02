package com.kevinbooms;

import com.kevinbooms.dao.InventoryDao;
import com.kevinbooms.dao.ItemDao;
import com.kevinbooms.dao.JdbcInventoryDao;
import com.kevinbooms.dao.JdbcItemDao;

import com.kevinbooms.model.Inventory;
import com.kevinbooms.model.Item;
import com.kevinbooms.view.InventoryMenu;
import com.kevinbooms.view.MainMenu;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.List;

public class ItemShop {

    private ItemDao itemDao;
    private InventoryDao inventoryDao;

    public ItemShop(DataSource dataSource) {
        itemDao = new JdbcItemDao(dataSource);
        inventoryDao = new JdbcInventoryDao(dataSource);
    }
    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/ItemShop");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        ItemShop shop = new ItemShop(dataSource);
        System.out.println("Current connection: " + dataSource.getUrl());
        shop.run();
    }

    public void run() {
        System.out.println("Welcome to the Item Shop");

        for (MainMenu option : MainMenu.values()) {
            System.out.println(option.getOption());
        }

        handleFindAllInventory();
    }

    private void printDivider() {
        System.out.printf("==========================================================================================================%n");
    }

    private void handleDisplayAllItems() {
        // Manual Test: Display all Items on Item table
        List<Item> allItems = itemDao.findAll();
        printDivider();
        System.out.printf("| %-25s | %-60s | %11s |%n", "ITEMS", "DESCRIPTION", "VALUE ");
        printDivider();
        for (Item item : allItems) {
            System.out.printf("| %-25s | %-60s | %10sG |%n", item.getItemName(), item.getItemDescription(), item.getItemValue());
        }
        printDivider();
    }

    private void handleFindAllInventory() {
        List<Inventory> allInventory = inventoryDao.findAll();
        printDivider();
        System.out.printf("| %-25s | %-16s | %-5s | %-10sG | %n", "ITEMS", "TYPE", "AVAILABLE", "PRICE");
        printDivider();
        for (Inventory item : allInventory) {
            System.out.printf("| %-25s | %-16s | %-5s | %-10sG | %n", item.getInventoryName(),
                    item.getInventoryType(), item.getInventoryAvailable(), item.getInventoryPrice());
        }
        printDivider();
    }
    private void handleFindBySearchTerm() {
        String term = "pot";
        List<Item> matchingItems = itemDao.findBySearchTerm(term);
        for (Item item : matchingItems) {
            System.out.println(item.getItemName() + ", " + item.getItemDescription() + " - " + item.getItemValue() + "G");
        }
    }
}



// Manual Test: Find Items by Type
//        List<Item> itemsMatchingType = itemDao.findItemsByType("MAGIC");
//        System.out.println("All items matching the \"Magic\" type: ");
//        for (Item item : itemsMatchingType) {
//            System.out.println(item.getItemName());
//        }