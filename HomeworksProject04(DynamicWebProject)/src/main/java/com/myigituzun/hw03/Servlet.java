package com.myigituzun.hw03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transaction")
public class Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Transaction transaction = new Transaction(501, "Elektrik Ödemesi", 5460);
		TransactionConverter converter = new TransactionConverter();
		
		String line = converter.format(transaction);
		StreamUtilities.write(response.getOutputStream(), line);
	}
}
