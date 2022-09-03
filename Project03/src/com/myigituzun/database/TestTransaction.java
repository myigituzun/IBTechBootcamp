package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);

        String sql = "insert into product(product_name,sale_price) values (?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1, "Traş Makinesi");
        statement1.setDouble(2, 688);
        int affected1 = statement1.executeUpdate();

        PreparedStatement statement2 = connection.prepareStatement(sql);
        statement2.setString(21, "Traş Makinesi");
        statement2.setDouble(2, 688);
        int affected2 = statement2.executeUpdate();

        PreparedStatement statement3 = connection.prepareStatement("+" + sql);
        statement3.setString(1, "Traş Makinesi");
        statement3.setDouble(2, 688);
        int affected3 = statement3.executeUpdate();

        connection.commit();
        connection.close();

        System.out.println(affected1 + affected2 + affected3);
    }
}
