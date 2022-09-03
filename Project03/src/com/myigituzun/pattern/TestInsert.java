package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestInsert {
    public static void main(String[] args) {
        try {
            Product product = new Product();
            product.setProductName("Ürün 104");
            product.setSalePrice(5646);

            ProductManager manager = new ProductManager();
            boolean inserted = manager.insert(product);

            if (inserted) {
                System.out.println("Ürün eklendi.");
            } else {
                System.out.println("Ürün eklenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
