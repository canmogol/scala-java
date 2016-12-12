package com.fererlab.java;

public class CustomerInitialsJ {
    private final String fullname;

    public CustomerInitialsJ(String name, String initials, String surname) {
        if (initials != null) {
            this.fullname = String.format("%s %s &s", name, initials, surname);
        } else {
            this.fullname = String.format("%s %s", name, surname);
        }
    }

    public CustomerInitialsJ(String name, String surname) {
        this(name, "", surname);
    }

}
