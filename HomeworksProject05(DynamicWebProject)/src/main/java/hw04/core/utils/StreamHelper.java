package hw04.core.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamHelper {
	public static void write(OutputStream outputStream, String output) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));

		writer.write(output);
		writer.flush();
		writer.close();
		outputStream.flush();
		outputStream.close();
	}

	public static String read(InputStream inputStream) throws IOException {
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
}
