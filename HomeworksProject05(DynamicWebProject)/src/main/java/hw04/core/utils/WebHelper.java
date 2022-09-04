package hw04.core.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebHelper {
	public static InputStream get(String address) throws IOException {
		return connect(address).getInputStream();
	}
	
	public static URLConnection connect(String address) throws MalformedURLException, IOException {
		return new URL(address).openConnection();
	}
}
