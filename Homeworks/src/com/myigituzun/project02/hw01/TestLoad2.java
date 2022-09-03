package com.myigituzun.project02.hw01;

import java.io.IOException;
import java.util.List;

public class TestLoad2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\GitHub\\IBTechBootcamp\\Homeworks\\src\\com\\myigituzun\\project02\\hw01\\Texts\\Customer.txt";
        CustomerFiler customerFiler = new CustomerFiler(path);

        List<Customer> customers = customerFiler.load();

        for (Customer customer : customers) {
            System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getTotalDebit());
        }
    }
}
