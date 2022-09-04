package com.myigituzun.hw03;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class Client {
	public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException, IOException {
		String address = "http://localhost:8080/Project04/transaction";
		String text = StreamUtilities.get(address);
		
		TransactionConverter converter = new TransactionConverter();
		Transaction transaction = converter.parse(text);
		

		System.out.println(transaction.toString());
	}
}
