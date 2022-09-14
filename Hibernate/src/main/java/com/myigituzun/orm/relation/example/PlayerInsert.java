package com.myigituzun.orm.relation.example;

import com.myigituzun.orm.relation.entity.Player;
import com.myigituzun.orm.relation.entity.Team;
import com.myigituzun.orm.relation.repository.PlayerRepository;
import com.myigituzun.orm.relation.repository.TeamRepository;

public class PlayerInsert {
	public static void main(String[] args) {
		long teamId = 2;
		TeamRepository teamRepository = new TeamRepository();
		
		Team team = teamRepository.find(teamId);

		Player player = new Player(0, "Mustafa Bayram", 4.1);
		player.setTeam(team);
		
		PlayerRepository playerRepository = new PlayerRepository();
		
		playerRepository.insert(player);
		
		System.out.println(player.getPlayerId());
	}
}
