package hw04.sports.xml;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static hw04.core.utils.XmlHepler.*;
import hw04.sports.database.entity.Player;

public class PlayerXml {
	public static Document format(Player player) throws ParserConfigurationException {
		Document document = create("player");
		
		Element element = document.getDocumentElement();
		element.setAttribute("id", Long.toString(player.getPlayerId()));
		
		addSingleElementText(document, element, "name", player.getPlayerName());
		addSingleElementText(document, element, "score", player.getAverageScore());
		
		return document;
	}
	
	public static Player parse(Document document) {
		Player player = null;
		
		Element element = document.getDocumentElement();
		long id = getAttribute(element, "id", 0);
		String name = getSingleElementText(element, "name", "");
		double score = getSingleElementText(element, "score", 0);
		
		player = new Player(id, name, score);
		
		return player;
	}
}
