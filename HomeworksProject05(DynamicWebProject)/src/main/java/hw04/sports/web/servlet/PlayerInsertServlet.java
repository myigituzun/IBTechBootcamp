package hw04.sports.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import hw04.core.utils.StreamHelper;
import hw04.core.utils.XmlHepler;
import hw04.sports.database.entity.Player;
import hw04.sports.database.manager.PlayerManager;
import hw04.sports.xml.PlayerXml;

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
