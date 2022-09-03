package com.myigituzun.inventory;

public class ProductTest1 {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductId(1);
        product.setProductName("Phone");
        product.setSalePrice(2500);

        System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getSalePrice());
    }
}
