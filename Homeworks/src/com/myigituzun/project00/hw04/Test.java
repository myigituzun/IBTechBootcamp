package com.myigituzun.project00.hw04;

import java.util.ArrayList;

import com.myigituzun.project00.hw03.Player;
import com.myigituzun.project00.hw03.Team;

public class Test {
    public static void main(String[] args) {
        League league = new League(601, "Süperlig");
        league.setTeamList(new ArrayList<>());

        Team team1 = new Team(801, "Godoro Spor");
        Team team2 = new Team(802, "Fibiler Spor");
        team1.setPlayerList(new ArrayList<>());
        team2.setPlayerList(new ArrayList<>());

        Player player1 = new Player(401, "Teoman Alpay", 4.67);
        Player player2 = new Player(402, "Yusuf Nalkesen", 7.89);
        Player player3 = new Player(403, "Yıldırım Gürses", 2.93);
        Player player4 = new Player(404, "Avni Anıl", 6.61);
        Player player5 = new Player(405, "Erdoğan Berker", 8.11);

        player1.setTeam(team1);
        player2.setTeam(team1);
        player3.setTeam(team2);
        player4.setTeam(team1);
        player5.setTeam(team2);

        team1.getPlayerList().add(player1);
        team1.getPlayerList().add(player2);
        team1.getPlayerList().add(player4);
        team2.getPlayerList().add(player3);
        team2.getPlayerList().add(player5);

        team1.setLeague(league);
        team2.setLeague(league);

        league.getTeamList().add(team1);
        league.getTeamList().add(team2);

        System.out.println(league.getLeagueId() + " " + league.getLeagueName());
        for (Team team : league.getTeamList()) {
            System.out.println("\t" + team.getTeamId() + " " + team.getTeamName());
            for (Player player : team.getPlayerList()) {
                System.out.println("\t\t" + player.getPlayerId() + " " + player.getPlayerName() + " " + player.getAverageScore());
            }
        }
    }
}
