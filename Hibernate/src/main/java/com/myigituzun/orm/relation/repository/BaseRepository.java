package com.myigituzun.orm.relation.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseRepository {
	private static EntityManagerFactory factory;

	protected static EntityManagerFactory getFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		}

		return factory;
	}
}
