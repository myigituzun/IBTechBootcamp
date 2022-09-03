package com.myigituzun.project02.hw03;

import java.io.IOException;
import java.util.List;

import com.myigituzun.project02.hw01.Customer;
import com.myigituzun.project02.hw01.CustomerFiler;

public class TestLoad {
    public static void main(String[] args) throws IOException {
        new Thread(() -> {
            try {
                list();
            } catch (IOException e) {
                e.printStackTrace();
            }
        })
            .start();
    }

    private static void list() throws IOException{
        String path = "D:\\GitHub\\IBTechBootcamp\\Homeworks\\src\\com\\myigituzun\\project02\\hw01\\Texts\\Customer.txt";
        CustomerFiler customerFiler = new CustomerFiler(path);

        List<Customer> customers = customerFiler.load();

        for (Customer customer : customers) {
            System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getTotalDebit());
        }
    }
}
