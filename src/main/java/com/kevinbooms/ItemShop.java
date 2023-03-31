package com.kevinbooms;

import com.kevinbooms.dao.ItemDao;
import com.kevinbooms.dao.JdbcItemDao;

import com.kevinbooms.view.InventoryMenu;
import com.kevinbooms.view.MainMenu;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

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

        for (MainMenu option : MainMenu.values()) {
            System.out.println(option.getOption());
        }

        for (InventoryMenu option : InventoryMenu.values()) {
            System.out.println(option.getOption());
        }

        System.out.println(itemDao.findAll());
        // Manual Test: Find Items by Type
//        List<Item> itemsMatchingType = itemDao.findItemsByType("MAGIC");
//        System.out.println("All items matching the \"Magic\" type: ");
//        for (Item item : itemsMatchingType) {
//            System.out.println(item.getItemName());
//        }
    }
}
