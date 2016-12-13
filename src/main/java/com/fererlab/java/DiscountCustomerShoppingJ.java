package com.fererlab.java;


public class DiscountCustomerShoppingJ extends CustomerShoppingJ {
    public DiscountCustomerShoppingJ(String name, String address) {
        super(name, address);
    }

    @Override
    public Double total() {
        return super.total() * 0.90;
    }
}
