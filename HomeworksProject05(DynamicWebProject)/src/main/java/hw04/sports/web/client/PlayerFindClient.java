package hw04.sports.web.client;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import hw04.core.utils.WebHelper;
import hw04.core.utils.XmlHepler;
import hw04.sports.database.entity.Player;
import hw04.sports.xml.PlayerXml;

public class PlayerFindClient {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		long playerId = 1;
		String address = String.format("http://localhost:8080/project05.homeworks/player/find?=%d", playerId);

		InputStream inputStream = WebHelper.get(address);
		Document document = XmlHepler.parse(inputStream);

		Player player = PlayerXml.parse(document);

		System.out.println(player.getPlayerId() + " " + player.getPlayerName() + " " + player.getAverageScore());
	}
}
