package com.myigituzun.composition.manager;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myigituzun.composition.entity.Department;

public class DepartmentManager extends BaseManager<Department> {
    
    @Override
    protected Department parse(ResultSet resultSet) throws SQLException {
        long departmentId = resultSet.getLong("department_id");
        String departmentName = resultSet.getString("department_name");

        Department department = new Department(departmentId, departmentName);

        return department;
    }
}
