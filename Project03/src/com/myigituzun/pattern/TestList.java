package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestList {
    public static void main(String[] args) throws SQLException {
        ProductManager manager = new ProductManager();

        for (Product product : manager.list()) {
            System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getSalePrice());
        }
    }
}
