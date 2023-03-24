package com.kevinbooms.model;

import java.util.Arrays;

public class Order {
    private int orderId;
    private String customer;
    private boolean isDelivered;
    private int totalSale;
    private String[] itemsCart;

    public Order(int orderId, String customer, boolean isDelivered, int totalSale, String[] itemsCart) {
        this.orderId = orderId;
        this.customer = customer;
        this.isDelivered = isDelivered;
        this.totalSale = totalSale;
        this.itemsCart = itemsCart;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }

    public String[] getItemsCart() {
        return itemsCart;
    }

    public void setItemsCart(String[] itemsCart) {
        this.itemsCart = itemsCart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer='" + customer + '\'' +
                ", isDelivered=" + isDelivered +
                ", totalSale=" + totalSale +
                ", itemsCart=" + Arrays.toString(itemsCart) +
                '}';
    }
}
