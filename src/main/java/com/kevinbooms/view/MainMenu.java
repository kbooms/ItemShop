package com.kevinbooms.view;

public enum MainMenu {
    INVENTORY("1) Inventory Management"),
    CUSTOMERS("2) Customer Database"),
    ORDERS("3) View Orders"),
    EXIT("0) Exit");

    private final String option;

    MainMenu(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
