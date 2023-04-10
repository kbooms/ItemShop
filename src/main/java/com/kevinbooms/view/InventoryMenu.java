package com.kevinbooms.view;

public enum InventoryMenu {
    SEE_ALL("1) Show all Inventory"),
    UPDATE_INVENTORY("2) Update Inventory"),
    ADD_INVENTORY("3) Add New Inventory"),
    DELETE_INVENTORY("4) Delete Inventory");

    private final String option;

    InventoryMenu(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
