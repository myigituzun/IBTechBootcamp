package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestDelete {
    public static void main(String[] args) {
        try {
            Product product = new Product();
            product.setProductId(20);

            ProductManager manager = new ProductManager();
            boolean deleted = manager.delete(product.getProductId());

            if (deleted) {
                System.out.println("Ürün eklendi.");
            } else {
                System.out.println("Ürün eklenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
