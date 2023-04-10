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
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

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
        displayAppBanner();

        for (MainMenu option : MainMenu.values()) {
            System.out.println(option.getOption());
        }
        MainMenu[] menu = MainMenu.values();
        int choice;
        choice = Integer.parseInt(getUserInput("Please choose a number ")) - 1;
        switch (menu[choice]) {
            case INVENTORY -> {
                System.out.println("1");
                for (InventoryMenu option : InventoryMenu.values()) {
                    System.out.println(option.getOption());
                }
                // can I make a menu runner from this?
                InventoryMenu[] inventory = InventoryMenu.values();

                break;
            }
            case CUSTOMERS -> {
                System.out.println("2");
                System.out.println(choice);
                break;
            }
            case ORDERS -> {
                System.out.println("3");
                break;
            }
            case EXIT -> {
                System.out.println("0");
                break;
            }
            default -> {
                break;
            }
        }
//         show all inventory available for now
//        handleFindAllInventory();


    }

    // console methods
    private void displayAppBanner() {
        System.out.println("_|_|_|    _|                                      _|_|_|  _|                            ");
        System.out.println("  _|    _|_|_|_|    _|_|    _|_|_|  _|_|        _|        _|_|_|      _|_|    _|_|_|    ");
        System.out.println("  _|      _|      _|_|_|_|  _|    _|    _|        _|_|    _|    _|  _|    _|  _|    _|  ");
        System.out.println("  _|      _|      _|        _|    _|    _|            _|  _|    _|  _|    _|  _|    _|  ");
        System.out.println("_|_|_|      _|_|    _|_|_|  _|    _|    _|      _|_|_|    _|    _|    _|_|    _|_|_|    ");
        System.out.println("                                                                              _|        ");
        System.out.println("                                                                              _|        ");
    }
    private void printDivider() {
        System.out.printf("====================================================================================%n");
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt + ":: ");
        return new Scanner(System.in).nextLine();
    }
    // handler methods

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
        System.out.printf("| %-35s | %-16s | %-9s | %-11s | %n", "ITEMS", "TYPE", "AVAILABLE", "PRICE");
        printDivider();
        for (Inventory item : allInventory) {
            System.out.printf("| %-35s | %-16s | %9s | %10sG | %n", item.getInventoryName(),
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