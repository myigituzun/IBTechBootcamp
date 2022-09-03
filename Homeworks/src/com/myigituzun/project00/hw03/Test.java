package com.myigituzun.project00.hw03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Team team = new Team(801, "Godoro Spor");
        team.setPlayerList(new ArrayList<>());

        Player player1 = new Player(401, "Teoman Alpay", 4.67);
        Player player2 = new Player(402, "Yusuf Nalkesen", 7.89);
        Player player3 = new Player(403, "Avni Anıl", 6.61);

        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);

        team.getPlayerList().add(player1);
        team.getPlayerList().add(player2);
        team.getPlayerList().add(player3);

        System.out.println(team.getTeamId() + " " + team.getTeamName());
        for (Player player : team.getPlayerList()) {
            System.out.println("\t" + player.getPlayerId() + " " + player.getPlayerName() + " " + player.getAverageScore());
        }
    }
}
