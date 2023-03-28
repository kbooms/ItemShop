package com.kevinbooms.view;

public enum CustomersMenu {
    FIND_ALL("1) Show All Customers"),
    FIND_BY_ID("2) Find by ID"),
    FIND_BY_NAME("3) Find by Name");

    private final String option;

    CustomersMenu(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
