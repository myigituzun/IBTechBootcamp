package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "update product set product_name=?, sale_price=? where product_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Tablet Bilgisayar");
        statement.setDouble(2, 3333);
        statement.setLong(3, 6);
        int affected = statement.executeUpdate();

        connection.close();

        System.out.println(affected);
    }
}
