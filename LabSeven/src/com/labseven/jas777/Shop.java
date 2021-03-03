package com.labseven.jas777;

public abstract class Shop {

    protected final String address;

    protected final Size size;

    public Shop(String address, Size size) {
        this.address = address;
        this.size = size;
    }

    protected String getInformation() {
        return address + " | " + size.getName();
    };

}
