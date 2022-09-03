package com.myigituzun.project03.hw01;

import java.sql.SQLException;

import com.myigituzun.project02.hw01.Customer;

public class TestList {
    public static void main(String[] args) throws SQLException {
        CustomerManager manager = new CustomerManager();

        for (Customer customer : manager.list()) {
            System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getTotalDebit());
        }
    }
}
