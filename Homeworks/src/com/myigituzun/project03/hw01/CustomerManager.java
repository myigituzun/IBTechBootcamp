package com.myigituzun.project03.hw01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myigituzun.project02.hw01.Customer;

public class CustomerManager {
    private String url = "jdbc:postgresql://localhost/ibtech";
    private String user = "postgres";
    private String password = "582916734g";

    public boolean insert(Customer customer) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into customer(customer_name,total_debit) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customer.getCustomerName());
        statement.setDouble(2, customer.getTotalDebit());
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public boolean update(Customer customer) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "update customer set customer_name=?, total_debit=? where customer_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customer.getCustomerName());
        statement.setDouble(2, customer.getTotalDebit());
        statement.setLong(3, customer.getCustomerId());
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public boolean delete(long customerId) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "delete from customer where customer_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, customerId);
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public List<Customer> list() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<Customer> customers = parseList(resultSet);

        connection.close();

        return customers;
    }

    public Customer find(long customerId) throws SQLException {
        Customer customer = null;

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from customer where customer_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, customerId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            customer = parse(resultSet);
        }

        connection.close();

        return customer;
    }

    public List<Customer> listByTotalDebitGreater(long totalDebitMin) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from customer where total_debit > ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, totalDebitMin);
        ResultSet resultSet = statement.executeQuery();

        List<Customer> customers = parseList(resultSet);

        connection.close();

        return customers;
    }

    private Customer parse(ResultSet resultSet) throws SQLException {
        long customerId = resultSet.getLong("customer_id");
        String customerName = resultSet.getString("customer_name");
        double totalDebit = resultSet.getDouble("total_debit");

        Customer customer = new Customer(customerId, customerName, totalDebit);

        return customer;
    }

    private List<Customer> parseList(ResultSet resultSet) throws SQLException {
        List<Customer> customers = new ArrayList<>();

        while (resultSet.next()) {
            customers.add(parse(resultSet));
        }

        return customers;
    }
}
