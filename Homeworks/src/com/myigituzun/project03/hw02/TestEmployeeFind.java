package com.myigituzun.project03.hw02;

import java.sql.SQLException;

public class TestEmployeeFind {
    public static void main(String[] args) throws SQLException {
        EmployeeManager manager = new EmployeeManager();
        Employee employee = manager.find(8);

        System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getMonthlySalary());
    }
}
