package com.myigituzun.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManager {
    private String url = "jdbc:postgresql://localhost/ibtech";
    private String dbUser = "postgres";
    private String dbPassword = "582916734g";

    public boolean create(User user) throws SQLException {

        Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
        
        String sql = "insert into user(username,password) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUserName());
        statement.setString(2, user.getPassword());
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public User find(long userId) throws SQLException {
        User user = null;

        Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);

        String sql = "select * from user where user_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, userId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            user = parse(resultSet);
        }

        connection.close();

        return user;
    }
    
    public User findByUserName(String userName) throws SQLException {
        User user = null;

        Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);

        String sql = "select * from user where username=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userName);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            user = parse(resultSet);
        }

        connection.close();

        return user;
    }

    private User parse(ResultSet resultSet) throws SQLException {
        long userId = resultSet.getLong("user_id");
        String userName = resultSet.getString("username");
        String password = resultSet.getString("password");

        User user = new User(userId, userName, password);

        return user;
    }
}
