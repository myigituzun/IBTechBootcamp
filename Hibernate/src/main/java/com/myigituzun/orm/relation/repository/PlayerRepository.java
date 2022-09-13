package com.myigituzun.orm.relation.repository;

import javax.persistence.EntityManager;

import com.myigituzun.orm.relation.entity.Player;

public class PlayerRepository extends BaseRepository {

	public void insert(Player player) {
		EntityManager manager = getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(player);
		manager.getTransaction().commit();
		manager.close();
	}
}
