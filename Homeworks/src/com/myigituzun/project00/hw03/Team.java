package com.myigituzun.project00.hw03;

import java.util.List;
import com.myigituzun.project00.hw04.League;

public class Team {
    private long teamId;
    private String teamName;
    private List<Player> playerList;
    private League league;

    public Team(long teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public Team() {
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

}
