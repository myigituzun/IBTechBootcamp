package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) {
        try {
            Product product = new Product();
            product.setProductId(20);
            product.setProductName("Mixer");
            product.setSalePrice(8855);

            ProductManager manager = new ProductManager();
            boolean updated = manager.update(product);

            if (updated) {
                System.out.println("Ürün güncellendi.");
            } else {
                System.out.println("Ürün güncellenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
