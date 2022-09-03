package com.myigituzun.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private String url = "jdbc:postgresql://localhost/ibtech";
    private String user = "postgres";
    private String password = "582916734g";

    public boolean insert(Product product) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into product(product_name,sale_price) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getProductName());
        statement.setDouble(2, product.getSalePrice());
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public boolean update(Product product) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "update product set product_name=?, sale_price=? where product_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getProductName());
        statement.setDouble(2, product.getSalePrice());
        statement.setLong(3, product.getProductId());
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public boolean delete(long productId) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "delete from product where product_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, productId);
        int affected = statement.executeUpdate();

        connection.close();

        return affected != 0;
    }

    public List<Product> list() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from product";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<Product> products = parseList(resultSet);

        connection.close();

        return products;
    }

    public Product find(long productId) throws SQLException {
        Product product = null;

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from product where product_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, productId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            product = parse(resultSet);
        }

        connection.close();

        return product;
    }

    public List<Product> listBySalePriceGreater(long salePriceMin) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from product where sale_price > ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, salePriceMin);
        ResultSet resultSet = statement.executeQuery();

        List<Product> products = parseList(resultSet);

        connection.close();

        return products;
    }

    private Product parse(ResultSet resultSet) throws SQLException {
        long productId = resultSet.getLong("product_id");
        String productName = resultSet.getString("product_name");
        double salePrice = resultSet.getDouble("sale_price");

        Product product = new Product(productId, productName, salePrice);

        return product;
    }

    private List<Product> parseList(ResultSet resultSet) throws SQLException {
        List<Product> products = new ArrayList<>();

        while (resultSet.next()) {
            products.add(parse(resultSet));
        }

        return products;
    }
}
