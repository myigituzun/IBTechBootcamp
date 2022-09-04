package hw04.sports.web.client;

import java.io.IOException;
import java.net.URLConnection;

import org.w3c.dom.Document;

import hw04.core.utils.StreamHelper;
import hw04.core.utils.WebHelper;
import hw04.core.utils.XmlHepler;
import hw04.sports.database.entity.Player;
import hw04.sports.xml.PlayerXml;

public class PlayerInsertClient {
	public static void main(String[] args) throws IOException {
		String address = "http://localhost:8080/player/insert";

		Player player = new Player(0, "Mahzuni Şerif", 2.5);
		Document document = PlayerXml.format(player);

		URLConnection connection = WebHelper.connect(address);
		connection.setRequestProperty("content-type", "application/xml; charset=UTF-8");
		
		XmlHepler.dump(document, connection.getOutputStream());

		String result = StreamHelper.read(connection.getInputStream());

		System.out.println(result);
	}
}
