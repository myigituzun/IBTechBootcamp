package com.myigituzun.orm.relation.example;

import com.myigituzun.orm.relation.entity.Team;
import com.myigituzun.orm.relation.repository.TeamRepository;

public class TeamFind {
	public static void main(String[] args) {
		long teamId = 3;
		TeamRepository teamRepository = new TeamRepository();
		Team team = teamRepository.find(teamId);
		System.out.println(team.getTeamId() + " " + team.getTeamName());
	}
}
