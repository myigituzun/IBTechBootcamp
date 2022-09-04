package com.myigituzun.sports.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import com.myigituzun.core.utils.StreamHelper;
import com.myigituzun.core.utils.XmlHepler;
import com.myigituzun.sports.database.entity.Player;
import com.myigituzun.sports.database.manager.PlayerManager;
import com.myigituzun.sports.xml.PlayerXml;

@WebServlet("/product/insert")
public class PlayerInsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Document document = XmlHepler.parse(request.getInputStream());
		
		Player player = PlayerXml.parse(document);	
		PlayerManager manager = new PlayerManager();
		
		boolean inserted = manager.insert(player);
		
		String result = inserted ? "Eklendi" : "Eklenmedi";
		
		StreamHelper.write(response.getOutputStream(), result);
	}
}
