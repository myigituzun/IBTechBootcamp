package hw04.sports.web.client;

import java.io.InputStream;

import org.w3c.dom.Document;

import hw04.core.utils.WebHelper;
import hw04.core.utils.XmlHepler;
import hw04.sports.database.entity.Player;
import hw04.sports.xml.PlayerXml;

public class PlayerFindClient {
	public static void main(String[] args) {
		long productId = 123;
		String address = String.format("http://localhost:8080/player/find?=%d", productId);

		InputStream inputStream = WebHelper.get(address);
		Document document = XmlHepler.parse(inputStream);

		Player player = PlayerXml.parse(document);

		System.out.println(player.getPlayerId() + " " + player.getPlayerName() + " " + player.getAverageScore());
	}
}
