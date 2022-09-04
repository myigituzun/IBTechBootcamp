package com.myigituzun.sports.web.client;

import java.io.InputStream;

import org.w3c.dom.Document;

import com.myigituzun.core.utils.WebHelper;
import com.myigituzun.core.utils.XmlHepler;
import com.myigituzun.sports.database.entity.Player;
import com.myigituzun.sports.xml.PlayerXml;

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
