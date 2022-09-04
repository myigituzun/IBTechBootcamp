package com.myigituzun.client;

import java.io.IOException;

import static com.myigituzun.utils.StreamUtilities.*;

public class GetClient {
	public static void main(String[] args) throws IOException {
		String address = "http://localhost:8080/Porject04/me";
		
		String text = get(address);
		
		System.out.println(text);
	}
}
