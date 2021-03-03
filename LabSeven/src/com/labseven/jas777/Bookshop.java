package com.labseven.jas777;

public class Bookshop extends Shop {

    private final String[] products;

    public Bookshop(String address, Size size, String[] products) {

        super(address, size);

        this.products = products;

    }

    public String[] getProducts() {
        return products;
    }

    @Override
    public String getInformation() {

        return "----- Bookshop -----" +
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
