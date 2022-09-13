package com.myigituzun.orm.relation.example;

import com.myigituzun.orm.relation.entity.Player;
import com.myigituzun.orm.relation.repository.PlayerRepository;

public class PlayerInsert {
	public static void main(String[] args) {
		PlayerRepository playerRepository = new PlayerRepository();
		Player player = new Player(0, "Celal Güzelses", 4.7);
		
		playerRepository.insert(player);
		
		System.out.println(player.getPlayerId());
	}
}
