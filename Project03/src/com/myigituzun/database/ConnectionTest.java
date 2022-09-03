package com.myigituzun.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        // String driver = "org.postgresql.Driver";
        // Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection.getMetaData().getDatabaseProductName() + " "
                + connection.getMetaData().getDatabaseMajorVersion());

        connection.close();
    }
}
