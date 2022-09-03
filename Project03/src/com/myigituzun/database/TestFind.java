package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestFind {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from product where product_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, 6);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            long productId = resultSet.getLong("product_id");
            String productName = resultSet.getString("product_name");
            double salePrice = resultSet.getDouble("sale_price");

            System.out.println(productId + " " + productName + " " + salePrice);
        }

        connection.close();
    }
}
