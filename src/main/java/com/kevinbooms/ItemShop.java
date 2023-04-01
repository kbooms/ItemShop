package com.kevinbooms;

import com.kevinbooms.dao.ItemDao;
import com.kevinbooms.dao.JdbcItemDao;

import com.kevinbooms.model.Item;
import com.kevinbooms.view.InventoryMenu;
import com.kevinbooms.view.MainMenu;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.List;

public class ItemShop {

    private ItemDao itemDao;

    public ItemShop(DataSource dataSource) {
        itemDao = new JdbcItemDao(dataSource);
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

//        for (MainMenu option : MainMenu.values()) {
//            System.out.println(option.getOption());
//        }

        // Manual Test: Display all Items on Item table
        List<Item> allItems = itemDao.findAll();
        System.out.printf("| %-25s | %-60s | %11s |%n", "ITEMS", "DESCRIPTION", "VALUE ");
        System.out.printf("%-99s%n", "==========================================================================================================");
        for (Item item : allItems) {
            System.out.printf("| %-25s | %-60s | %10sG |%n", item.getItemName(), item.getItemDescription(), item.getItemValue());
        }

        // Manual Test: Find Items by Type
//        List<Item> itemsMatchingType = itemDao.findItemsByType("MAGIC");
//        System.out.println("All items matching the \"Magic\" type: ");
//        for (Item item : itemsMatchingType) {
//            System.out.println(item.getItemName());
//        }
    }
}
