package com.myigituzun.project00.hw03;

public class Player {
    private long playerId;
    private String playerName;
    private double averageScore;
    private Team team;

    public Player(long playerId, String playerName, double averageScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.averageScore = averageScore;
    }

    public Player() {
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
