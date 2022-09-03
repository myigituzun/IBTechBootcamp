package com.myigituzun.project03.hw01;

import java.sql.SQLException;

import com.myigituzun.project02.hw01.Customer;

public class TestInsert {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setCustomerName("Ürün 105");
            customer.setTotalDebit(5646);

            CustomerManager manager = new CustomerManager();
            boolean inserted = manager.insert(customer);

            if (inserted) {
                System.out.println("Ürün eklendi.");
            } else {
                System.out.println("Ürün eklenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
