package com.kevinbooms.model;

/**
 * This model class outlines an Item in the Shop's inventory
 */

public class Item {
    private int itemId;
    private String itemName;
    private String itemType;
    private int itemValue;
    private String itemDescription;

    public Item(int itemId, String itemName, String itemType, int itemValue, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemValue = itemValue;
        this.itemDescription = itemDescription;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemValue=" + itemValue +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
