package com.myigituzun.project03.hw02;

import java.sql.SQLException;

public class TestEmployeeList {
    public static void main(String[] args) throws SQLException {
        EmployeeManager manager = new EmployeeManager();

        for (Employee employee : manager.list()) {
            System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getMonthlySalary());
        }
    }
}
