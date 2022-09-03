package com.myigituzun.project03.hw01;

import java.sql.SQLException;

import com.myigituzun.project02.hw01.Customer;

public class TestFind {
    public static void main(String[] args) throws SQLException {
        CustomerManager manager = new CustomerManager();
        Customer customer = manager.find(8);

        System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getTotalDebit());
    }
}
