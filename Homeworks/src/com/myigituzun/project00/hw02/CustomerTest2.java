package com.myigituzun.project00.hw02;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customer = new Customer(501, "Neşet Ertaş", 4350);

        System.out.println("Müşteri ID: "+ customer.getCostomerId());
        System.out.println("Müşteri Adı: "+ customer.getCostomerName());
        System.out.println("Müşteri Borcu: "+ customer.getTotalDebit());
    }
}
