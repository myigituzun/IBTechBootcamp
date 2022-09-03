package com.myigituzun.project03.hw02;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeManager extends BaseManager<Employee> {
    public Employee find(long employeeId) throws SQLException {
        Employee employee = null;

        connect();

        String sql = "select * from employee where employee_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, employeeId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            employee = parse(resultSet);
        }

        disconnect();

        return employee;
    }

    public List<Employee> list() throws SQLException {
        connect();

        String sql = "select * from employee";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<Employee> employees = parseList(resultSet);

        disconnect();

        return employees;
    }


    protected Employee parse(ResultSet resultSet) throws SQLException {
        long employeeId = resultSet.getLong("employee_id");
        String employeeName = resultSet.getString("employee_name");
        double monthlySalary = resultSet.getDouble("monthly_salary");

        Employee employee = new Employee(employeeId, employeeName, monthlySalary);

        return employee;
    }
}
