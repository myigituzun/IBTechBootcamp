package com.myigituzun.inventory;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Product(2, "PC", 5500);

        System.out.println("Ürün ID: "+ product.getProductId());
        System.out.println("Ürün Adı: "+ product.getProductName());
        System.out.println("Ürün Fiyatı: "+ product.getSalePrice());
    }
}
