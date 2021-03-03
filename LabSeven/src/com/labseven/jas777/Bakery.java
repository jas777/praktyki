package com.labseven.jas777;

public class Bakery extends Shop {

    private final String[] products;

    public Bakery(String address, Size size, String[] products) {

        super(address, size);

        this.products = products;

    }

    public String[] getProducts() {
        return products;
    }

    @Override
    public String getInformation() {

        return "----- Bakery -----" +
               "\n" +
               "Address  : " +
               this.address +
               "\n" +
               "Size     : " +
               this.size.getName() +
               "\n" +
               "Products : " +
               String.join(", ", products);

    }

}
