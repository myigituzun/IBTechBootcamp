package com.myigituzun.sports.web.client;

import java.io.IOException;
import java.net.URLConnection;

import org.w3c.dom.Document;

import com.myigituzun.core.utils.StreamHelper;
import com.myigituzun.core.utils.WebHelper;
import com.myigituzun.core.utils.XmlHepler;
import com.myigituzun.sports.database.entity.Player;
import com.myigituzun.sports.xml.PlayerXml;

public class PlayerInsertClient {
	public static void main(String[] args) throws IOException {
		String address = "http://localhost:8080/player/insert";

		Player player = new Player(0, "Mahzuni Şerif", 2.5);
		Document document = PlayerXml.format(player);

		URLConnection connection = WebHelper.connect(address);
		XmlHepler.dump(document, connection.getOutputStream());

		String result = StreamHelper.read(connection.getInputStream());

		System.out.println(result);
	}
}
