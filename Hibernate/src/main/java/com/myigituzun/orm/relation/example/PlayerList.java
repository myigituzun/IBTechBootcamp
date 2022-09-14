package com.myigituzun.orm.relation.example;

import com.myigituzun.orm.relation.entity.Player;
import com.myigituzun.orm.relation.repository.PlayerRepository;

public class PlayerList {
	public static void main(String[] args) {
		PlayerRepository playerRepository = new PlayerRepository();
		for (Player player : playerRepository.list()) {
			System.out.println(player.getPlayerName());
		}
	}
}
