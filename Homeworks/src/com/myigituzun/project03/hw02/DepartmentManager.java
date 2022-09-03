package com.myigituzun.project03.hw02;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentManager extends BaseManager<Department> {
    
    @Override
    protected Department parse(ResultSet resultSet) throws SQLException {
        long departmentId = resultSet.getLong("department_id");
        String departmentName = resultSet.getString("department_name");

        Department department = new Department(departmentId, departmentName);

        return department;
    }
}
