package com.fererlab.java;


import java.util.ArrayList;
import java.util.List;

public class CustomerShoppingJ {

    private final String name;
    private final String address;
    private final ShoppingBasket basket = new ShoppingBasket();

    public CustomerShoppingJ(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void add(Item item) {
        basket.add(item);
    }

    public Double total() {
        return basket.value();
    }
}

class ShoppingBasket {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public Double value() {
        return items.stream().mapToDouble(Item::getValue).sum();
    }
}

class Item {

    private final String name;
    private final double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
