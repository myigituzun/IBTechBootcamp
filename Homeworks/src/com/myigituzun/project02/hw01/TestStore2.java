package com.myigituzun.project02.hw01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestStore2 {
    public static void main(String[] args) {
        
        try {
            List<Customer> customers = new ArrayList<>();

            customers.add(new Customer(601, "Cem Karaca", 6540));
            customers.add(new Customer(602, "Barış Manço", 7645));
            customers.add(new Customer(603, "Fikret Kızılok", 3450));

            String path = "D:\\GitHub\\IBTechBootcamp\\Homeworks\\src\\com\\myigituzun\\project02\\hw01\\Texts\\Customer.txt";
            CustomerFiler customerFiler = new CustomerFiler(path);
            customerFiler.store(customers);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
