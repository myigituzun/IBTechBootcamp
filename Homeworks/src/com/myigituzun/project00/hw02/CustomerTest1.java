package com.myigituzun.project00.hw02;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCostomerId(501);
        customer.setCostomerName("Neşet Ertaş");
        customer.setTotalDebit(4350);

        System.out.println(customer.getCostomerId() + " " + customer.getCostomerName() + " " + customer.getTotalDebit());
    }
}
