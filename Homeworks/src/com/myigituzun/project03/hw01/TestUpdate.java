package com.myigituzun.project03.hw01;

import java.sql.SQLException;

import com.myigituzun.project02.hw01.Customer;

public class TestUpdate {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setCustomerId(20);
            customer.setCustomerName("Mixer");
            customer.setTotalDebit(8855);

            CustomerManager manager = new CustomerManager();
            boolean updated = manager.update(customer);

            if (updated) {
                System.out.println("Ürün güncellendi.");
            } else {
                System.out.println("Ürün güncellenemedi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
