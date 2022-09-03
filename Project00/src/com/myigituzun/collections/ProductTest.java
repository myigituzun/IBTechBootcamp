package com.myigituzun.collections;

import com.myigituzun.inventory.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Phone", 1300),
                new Product(2, "PC", 6540),
                new Product(3, "Car", 7865)
        };

        double priceSum = 0;
        int count = 0;
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getSalePrice());

            if (product.getSalePrice() > 5000) {
                priceSum += product.getSalePrice();
                count++;
            }
        }
        System.out.println("Fiyat Özeti: " + priceSum);
        double priceAverage = priceSum / count;
        System.out.println("Ortalama: " + priceAverage);
    }
}
