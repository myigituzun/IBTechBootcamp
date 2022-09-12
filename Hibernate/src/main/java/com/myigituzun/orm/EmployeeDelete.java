package com.myigituzun.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDelete {
	public static void main(String[] args) {
		long employeeId = 2;

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee employee = manager.find(Employee.class, employeeId);
		manager.remove(employee);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
