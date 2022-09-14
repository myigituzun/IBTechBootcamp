package com.myigituzun.orm.relation.repository;

import com.myigituzun.orm.relation.entity.Player;

public class PlayerRepository extends BaseRepository<Player> {

	public PlayerRepository() {
		super(Player.class);
	}
	
}
