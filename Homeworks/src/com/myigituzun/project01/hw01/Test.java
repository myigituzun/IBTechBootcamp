package com.myigituzun.project01.hw01;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(401, "Neşet", "Ertaş", 3450);
        Person person = new Customer(402, "Mahzuni", "Şerif", 6586);
        Supplier supplier = new Supplier(701, "Orhan", "Gencebay", 8125);
        Employee employee = new Employee(201, "Erkan", "Ocaklı", 5470);

        customer.setEmail("neset@godoro.com");
        person.setEmail("mahzuni@godoro.com");
        supplier.setEmail("orhan@godoro.com");
        employee.setEmail("erkan@godoro.com");

        System.out.println(customer.getGreeting() + " " + customer.getFullName());
        System.out.println(person.getGreeting() + " " + person.getFullName());
        System.out.println(supplier.getGreeting() + " " + supplier.getFullName());
        System.out.println(employee.getGreeting() + " " + employee.getFullName() + "\n");

        sendMail(customer);
        sendMail(person);
        sendMail(supplier);
        sendMail(employee);
    }

    private static void sendMail(Person person) {
        System.out.println("Kime: " + person.getEmail());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName() + "\n");
    }
}
