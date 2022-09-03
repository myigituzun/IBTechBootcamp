package com.myigituzun.client;

import static com.myigituzun.utils.StreamUtilities.*;

public class PostClient {
	public static void main(String[] args) throws Exception {
		String address = "http://localhost:8080/Porject04/post";
		
		String inputStream = post(address, "Giden");
		
		System.out.println("Girdi: " + inputStream);
	}
}
