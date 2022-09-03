package com.myigituzun.project02.hw03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.myigituzun.project02.hw01.Customer;
import com.myigituzun.project02.hw01.CustomerFiler;

public class TestStore {

    private static List<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        customers.add(new Customer(601, "Cem Karaca", 6540));
        customers.add(new Customer(602, "Barış Manço", 7645));
        customers.add(new Customer(603, "Fikret Kızılok", 3450));

        new Thread(() -> {
            try {
                create();
            } catch (IOException e) {
                e.printStackTrace();
            }
        })
            .start();
    }

    private static void create() throws IOException{
        String path = "D:\\GitHub\\IBTechBootcamp\\Homeworks\\src\\com\\myigituzun\\project02\\hw01\\Texts\\Customer.txt";
        CustomerFiler customerFiler = new CustomerFiler(path);
        customerFiler.store(customers);
    }
}
