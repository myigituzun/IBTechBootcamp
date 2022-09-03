package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "delete from product where product_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, 4);
        int affected = statement.executeUpdate();

        connection.close();

        System.out.println(affected);
    }
}
