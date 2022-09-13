package com.myigituzun.orm.relation.test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.myigituzun.orm.relation.entity.Player;
import com.myigituzun.orm.relation.entity.Team;

public class TestInsert {
	public static void main(String[] args) {
		Team teamA = new Team(0, "Bizimkiler Spor");
		teamA.setPlayerList(new ArrayList<Player>());
		
		Player player1 = new Player(0, "Dadaloğlu", 8.9);
		player1.setTeam(teamA);
		teamA.getPlayerList().add(player1);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		manager.persist(teamA);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println(teamA.getTeamId());
	}
}
