package com.myigituzun.project03.hw02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseManager<E> {
    private String url = "jdbc:postgresql://localhost/ibtech";
    private String user = "postgres";
    private String password = "582916734g";

    protected Connection connection;

    protected void connect() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    protected void disconnect() throws SQLException {
        if (connection != null){
            connection.close();
        }
    }

    protected List<E> parseList(ResultSet resultSet) throws SQLException {
        List<E> entitys = new ArrayList<>();

        while (resultSet.next()) {
            entitys.add(parse(resultSet));
        }

        return entitys;
    }

    protected abstract E parse(ResultSet resultSet) throws SQLException;
}
