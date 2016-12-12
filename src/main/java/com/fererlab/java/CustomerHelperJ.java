package com.fererlab.java;


public class CustomerHelperJ {

    private static Integer sequenceOfIds = 0;

    private final String name;
    private final String address;
    private final Integer id;

    private CustomerHelperJ(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = nextId();
    }

    private static Integer nextId() {
        return sequenceOfIds++;
    }

    public static CustomerHelperJ createCustomer(String name, String address) {
        return new CustomerHelperJ(name, address);
    }

}


