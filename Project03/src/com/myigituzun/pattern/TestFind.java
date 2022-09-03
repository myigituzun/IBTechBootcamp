package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestFind {
    public static void main(String[] args) throws SQLException {
        ProductManager manager = new ProductManager();
        Product product = manager.find(8);

        System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getSalePrice());
    }
}
