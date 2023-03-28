package com.kevinbooms.view;

public enum InventoryMenu {
    SEE_ALL("1) Show all Inventory"),
    SEARCH_BY_TYPE("2) Search by Type"),
    SEARCH_BY_NAME("3) Search by Name"),
    SEARCH_BY_VALUE("4) Seach by Value");

    private final String option;

    InventoryMenu(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
