package com.myigituzun.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.myigituzun.utils.StreamUtilities.*;

@WebServlet("/post")
public class PostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InputStream inputStream = request.getInputStream();
		String input = read(inputStream);
		System.out.println("Girdi: " + input);
		OutputStream outputStream = response.getOutputStream();
		write(outputStream, "Oldu");
		
		
	}
}
