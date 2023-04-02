package com.kevinbooms.model;

public class Inventory {

    private long id;
    private String name;
    private String type;
    private int avaialble;
    private int price;

    public Inventory() {
        this.id = id;
        this.name = name;
        this.type = type;
        this.avaialble = avaialble;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAvaialble() {
        return avaialble;
    }

    public void setAvaialble(int avaialble) {
        this.avaialble = avaialble;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avaialble=" + avaialble +
                ", price=" + price +
                '}';
    }
}
