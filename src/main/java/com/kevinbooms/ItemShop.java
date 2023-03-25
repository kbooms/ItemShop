package com.kevinbooms;

import com.kevinbooms.dao.ItemDao;
import com.kevinbooms.dao.OrderDao;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

public class ItemShop {

    private ItemDao itemDao;
    private OrderDao orderDao;

    public ItemShop(DataSource dataSource) {

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
    }
}
