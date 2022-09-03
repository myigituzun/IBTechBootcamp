package com.myigituzun.project01.hw01;

public class Employee extends Person {
    private long employeeId;
    private double monthlySalary;

    public Employee(long employeeId, String firstName, String lastName, double monthlySalary) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getGreeting() {
        // TODO Auto-generated method stub
        return "Selam";
    }

}
