package hw04.core.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlHepler {
	
	private static DocumentBuilderFactory factory;

	private static DocumentBuilderFactory getFactory() {
		if (factory == null) {
			factory = DocumentBuilderFactory.newInstance();
		}
		return factory;
	};
	
	public static void dump(Document document, OutputStream outputStream) throws IOException, TransformerException {

		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		
		DOMSource data = new DOMSource(document);
		StreamResult result = new StreamResult(outputStream);
		transformer.transform(data, result);
		
		outputStream.close();
	}

	public static Document parse(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder builder = getFactory().newDocumentBuilder();
		
		return builder.parse(inputStream);
	}
	
	public static Document create(String root) throws ParserConfigurationException {
		DocumentBuilder builder = getFactory().newDocumentBuilder();
		Document document = builder.newDocument();
		Element element = document.createElement(root);
		document.appendChild(element);

		return document;
	}
	
	public static void addSingleElementText(Document document, Element parent, String tag, String content) {
		Element name = document.createElement(tag);
		name.setTextContent(content);
		parent.appendChild(name);
	}

	public static void addSingleElementText(Document document, Element parent, String tag, double content) {
		String string = Double.toString(content);
		addSingleElementText(document, parent, tag, string);
	}
	
	public static String getSingleElementText(Element parent, String tag, String defaultValue) {
		NodeList elementList = parent.getElementsByTagName(tag);
		if (elementList.getLength() == 0) {
			return defaultValue;
		}
		return elementList.item(0).getTextContent();
	}

	public static double getSingleElementText(Element parent, String tag, double defaultValue) {
		String string = getSingleElementText(parent, tag, Double.toString(defaultValue));

		return Double.parseDouble(string);
	}

	public static String getAttribute(Element element, String name, String defaultValue) {
		if (!element.hasAttribute(name)) {
			return defaultValue;
		}
		return element.getAttribute(name);
	}

	public static long getAttribute(Element element, String name, long defaultValue) {
		String string = getAttribute(element, name, Double.toString(defaultValue));

		return Long.parseLong(string);
	}
}
