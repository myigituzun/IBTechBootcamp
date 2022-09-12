package com.myigituzun.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
		long employeeId=1;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Employee employee = manager.find(Employee.class, employeeId);
		employee.setEmployeeName("Neşet Ertaş");
		employee.setMonthlySalary(55478);
		
		manager.merge(employee);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println(employee.getEmployeeId());
	}
}
