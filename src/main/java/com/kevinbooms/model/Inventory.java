package com.kevinbooms.model;

public class Inventory {

    private long inventoryId;
    private String inventoryName;
    private String inventoryType;
    private int inventoryAvailable;
    private int inventoryPrice;

    public Inventory(long inventoryId, String inventoryName, String inventoryType, int inventoryAvailable, int inventoryPrice) {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.inventoryType = inventoryType;
        this.inventoryAvailable = inventoryAvailable;
        this.inventoryPrice = inventoryPrice;
    }

    public Inventory() {

    }

    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getInventoryAvailable() {
        return inventoryAvailable;
    }

    public void setInventoryAvailable(int inventoryAvailable) {
        this.inventoryAvailable = inventoryAvailable;
    }

    public int getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(int inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", inventoryName='" + inventoryName + '\'' +
                ", inventoryType='" + inventoryType + '\'' +
                ", inventoryAvailable=" + inventoryAvailable +
                ", inventoryPrice=" + inventoryPrice +
                '}';
    }
}