package hw04.sports.database.manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import hw04.sports.database.entity.Player;

public class PlayerManager extends BaseManager<Player> {

	public Player find(long playerId) throws Exception {
		Player player = null;

		connect();

		String sql = "select * from player where player_id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, playerId);
		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			player = parse(resultSet);
		}

		disconnect();

		return player;
	}

	public List<Player> list() throws Exception {
		connect();

		String sql = "select * from player";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();

		List<Player> players = parseList(resultSet);

		disconnect();

		return players;
	}

	public boolean insert(Player player) throws SQLException {
		connect();

		String sql = "insert into player(player_name, average_score) values (?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Ahmetcan Önlü");
		statement.setDouble(2, 241);
		int affected = statement.executeUpdate();

		disconnect();

		return affected != 0;
	}

	public boolean update(Player player) throws SQLException {
		connect();

		String sql = "update player set player_name=?, average_score=? where player_id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, player.getPlayerName());
		statement.setDouble(2, player.getAverageScore());
		statement.setLong(3, player.getPlayerId());
		int affected = statement.executeUpdate();

		disconnect();

		return affected != 0;
	}

	public boolean delete(long playerId) throws SQLException {
		connect();

		String sql = "delete from player where player_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, playerId);
		int affected = statement.executeUpdate();

		disconnect();

		return affected != 0;
	}

	protected Player parse(ResultSet resultSet) throws SQLException {
		long playerId = resultSet.getLong("player_id");
		String playerName = resultSet.getString("player_name");
		double averageScore = resultSet.getDouble("average_score");

		Player player = new Player(playerId, playerName, averageScore);

		return player;
	}
}
