package com.myigituzun.inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(401, "Neşet", "Ertaş", 3450);
        Person person = new Customer(402, "Mahzuni", "Şerif", 6586);
        Supplier supplier = new Supplier(701, "Orhan", "Gencebay", 8125);

        customer.setEmail("neset@godoro.com");
        person.setEmail("mahzuni@godoro.com");
        supplier.setEmail("orhan@godoro.com");

        System.out.println(customer.getGreeting() + " " + customer.getFullName());
        System.out.println(person.getGreeting() + " " + person.getFullName());
        System.out.println(supplier.getGreeting() + " " + supplier.getFullName() + "\n");

        sendMail(customer);
        sendMail(person);
        sendMail(supplier);
    }

    private static void sendMail(Person person) {
        System.out.println("Kime: " + person.getEmail());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName() + "\n");
    }
}
