package com.myigituzun.pattern;

import java.sql.SQLException;

public class TestFilter {
    public static void main(String[] args) throws SQLException {
        ProductManager manager = new ProductManager();

        for (Product product : manager.listBySalePriceGreater(3029)) {
            System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getSalePrice());
        }
    }
}
