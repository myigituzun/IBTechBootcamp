package com.myigituzun.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RelationList {
    
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from employee e \r\n" + "left join department d on e.department_id = d.department_id";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            long employeeId = resultSet.getLong("employee_id");
            String employeeName = resultSet.getString("employee_name");
            double monthlySalary = resultSet.getDouble("monthly_salary");
            long departmentId = resultSet.getLong("department_id");
            String departmentName = resultSet.getString("department_name");

            System.out.println(employeeId + " " + employeeName + " " + monthlySalary + " " + departmentId + " " + departmentName);
        }

        connection.close();
    }
}
