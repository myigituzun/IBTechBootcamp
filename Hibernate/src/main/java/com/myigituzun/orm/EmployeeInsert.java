package com.myigituzun.orm;

import javax.persistence.*;

public class EmployeeInsert {
	public static void main(String[] args) {
		Employee employee = new Employee(0, "Ahmet Gürses", 4520);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		manager.persist(employee);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println(employee.getEmployeeId());
	}
}
