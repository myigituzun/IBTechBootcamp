package com.myigituzun.orm.relation.repository;

import com.myigituzun.orm.relation.entity.Team;

public class TeamRepository extends BaseRepository<Team> {

	public TeamRepository() {
		super(Team.class);
	}
	
}
