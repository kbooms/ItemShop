package com.kevinbooms.view;

public enum MainMenu {
    INVENTORY("1) Inventory Management"),
    ORDERS("2) View Orders"),
    CUSTOMERS("3) Customer Database"),
    EXIT("0) Exit");

    private final String option;

    MainMenu(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
