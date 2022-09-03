package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into product(product_name,sale_price) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Traş Makinesi");
        statement.setDouble(2, 688);
        int affected = statement.executeUpdate();

        connection.close();

        System.out.println(affected);
    }
}
