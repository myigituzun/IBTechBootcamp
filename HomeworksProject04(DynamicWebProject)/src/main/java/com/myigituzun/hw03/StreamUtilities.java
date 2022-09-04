package com.myigituzun.hw03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class StreamUtilities {
	public static String read(InputStream inputStream) throws UnsupportedEncodingException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));

		String line;
		StringBuilder builder = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			builder.append(line).append("\r\n");
		}
		reader.close();
		
		String text = builder.toString();
		return text;
	}
	
	public static void write(OutputStream outputStream, String output) throws UnsupportedEncodingException, IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));
		
		writer.write(output);
		writer.flush();
		writer.close();
		outputStream.flush();
		outputStream.close();
	}
	
	public static String get(String address) throws MalformedURLException, IOException, UnsupportedEncodingException {
		URL url = new URL(address);

		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();

		String text = read(inputStream);
		return text;
	}
	
	public static String post(String address, String output) throws MalformedURLException, IOException, UnsupportedEncodingException {
		URL url = new URL(address);
		URLConnection connection = url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		
		write(connection.getOutputStream(), output);
		String inputStream = StreamUtilities.read(connection.getInputStream());
		return inputStream;
	}
}
