package com.myigituzun.project01.hw01;

public class Customer extends Person {
    private long customerId;
    private double totalDebit;

    public Customer(long customerId, String firstName, String lastName, double totalDebit) {
        super(firstName, lastName);
        this.customerId = customerId;
        this.totalDebit = totalDebit;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

    @Override
    public String getFullName() {
        return getLastName() + ", " + getFirstName();
    }

    @Override
    public String getGreeting() {
        return "Merhaba";
    }
}
