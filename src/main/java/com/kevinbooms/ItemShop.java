package com.kevinbooms;

import com.kevinbooms.dao.JdbcOrderDao;
import com.kevinbooms.model.Item;
import com.kevinbooms.dao.ItemDao;
import com.kevinbooms.dao.JdbcItemDao;
import com.kevinbooms.dao.OrderDao;
import com.kevinbooms.model.Order;

import com.kevinbooms.view.CustomersMenu;
import com.kevinbooms.view.InventoryMenu;
import com.kevinbooms.view.MainMenu;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.List;

public class ItemShop {

    private ItemDao itemDao;
    private OrderDao orderDao;

    public ItemShop(DataSource dataSource) {
        itemDao = new JdbcItemDao(dataSource);
        orderDao = new JdbcOrderDao(dataSource);
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

        for (CustomersMenu option : CustomersMenu.values()) {
            System.out.println(option.getOption());
        }

        // Manual Test: Get Total Sales
        System.out.println("Total Sales: " + orderDao.getTotalGold());

        // Manual Test: Find Order by ID
//        Order orderById = orderDao.getOrder(2);
//        System.out.println(orderById);

        // Manual Test: Find Item by ID
//        Item itemById = itemDao.getItem(16);
//        System.out.println("ID " + itemById.getItemId() + ") " +itemById.getItemName() +
//                           " - " + itemById.getItemDescription() + ", " +
//                           itemById.getItemValue() + " Gold");

        // Manual Test: Find Items by Type
//        List<Item> itemsMatchingType = itemDao.findItemsByType("MAGIC");
//        System.out.println("All items matching the \"Magic\" type: ");
//        for (Item item : itemsMatchingType) {
//            System.out.println(item.getItemName());
//        }
    }
}
