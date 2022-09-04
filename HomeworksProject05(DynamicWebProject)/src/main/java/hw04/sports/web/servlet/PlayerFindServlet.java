package hw04.sports.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import hw04.core.utils.XmlHepler;
import hw04.sports.database.entity.Player;
import hw04.sports.database.manager.PlayerManager;
import hw04.sports.xml.PlayerXml;

@WebServlet("/player/find")
public class PlayerFindServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			long playerId = Long.parseLong(requset.getParameter("id"));

			PlayerManager manager = new PlayerManager();
			Player player = manager.find(playerId);

			Document document = PlayerXml.format(player);

			response.setContentType("application/xml; charset=UTF-8");

			XmlHepler.dump(document, response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
