package com.myigituzun.project00.hw02;

public class Customer {
    private long costomerId;
    private String costomerName;
    private double totalDebit;

    public Customer(long costomerId, String costomerName, double totalDebit) {
        this.costomerId = costomerId;
        this.costomerName = costomerName;
        this.totalDebit = totalDebit;
    }

    public Customer() {
    }

    public long getCostomerId() {
        return costomerId;
    }

    public void setCostomerId(long costomerId) {
        this.costomerId = costomerId;
    }

    public String getCostomerName() {
        return costomerName;
    }

    public void setCostomerName(String costomerName) {
        this.costomerName = costomerName;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

}
