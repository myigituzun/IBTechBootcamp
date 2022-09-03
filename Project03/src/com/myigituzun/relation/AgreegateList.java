package com.myigituzun.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgreegateList {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/ibtech";
        String user = "postgres";
        String password = "582916734g";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "SELECT e.department_id, d.department_name, sum(monthly_salary) as salarySum from employee e right join department d on e.department_id = d.department_id group by e.department_id, d.department_name";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            long departmentId = resultSet.getLong("department_id");
            String departmentName = resultSet.getString("department_name");
            double salarySum = resultSet.getDouble("salarySum");

            System.out.println(departmentId + " " + departmentName + " " + salarySum);
        }

        connection.close();
    }
}
