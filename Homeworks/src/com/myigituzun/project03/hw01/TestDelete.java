package com.myigituzun.project03.hw01;

import java.sql.SQLException;

import com.myigituzun.project02.hw01.Customer;

public class TestDelete {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setCustomerId(2);

            CustomerManager manager = new CustomerManager();
            boolean deleted = manager.delete(customer.getCustomerId());

            if (deleted) {
                System.out.println("Müşteri eklendi.");
            } else {
                System.out.println("Müşteri eklenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
