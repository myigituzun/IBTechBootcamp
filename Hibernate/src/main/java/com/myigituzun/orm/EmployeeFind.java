package com.myigituzun.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFind {
	public static void main(String[] args) {
		long employeeId=1;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Employee employee = manager.find(Employee.class, employeeId);
		
		manager.close();
		factory.close();
		
		System.out.println(employee.getEmployeeName());
	}
}
