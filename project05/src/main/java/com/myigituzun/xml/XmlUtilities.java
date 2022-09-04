package com.myigituzun.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XmlUtilities {

	private static DocumentBuilderFactory factory;

	private static DocumentBuilderFactory getFactory() {
		if (factory == null) {
			factory = DocumentBuilderFactory.newInstance();
		}
		return factory;
	};

	public static Document parse(String path) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder builder = getFactory().newDocumentBuilder();
		return builder.parse(path);
	}

	public static Document create(String root) throws ParserConfigurationException {
		DocumentBuilder builder = getFactory().newDocumentBuilder();
		Document document = builder.newDocument();
		Element employee = document.createElement(root);
		document.appendChild(employee);

		return document;
	}

	public static void dump(Document document, String path) throws TransformerException, IOException {
		FileWriter writer = new FileWriter(new File(path));
		dump(document, writer);
	}
	
	public static void dump(Document document, Writer writer) throws TransformerException, IOException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		DOMSource data = new DOMSource(document);
		StreamResult result = new StreamResult(writer);
		transformer.transform(data, result);
		System.out.println("Kontrol edin");
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

	public static void addSingleElementText(Document document, Element parent, String tag, String content) {
		Element name = document.createElement(tag);
		name.setTextContent(content);
		parent.appendChild(name);
	}

	public static void addSingleElementText(Document document, Element parent, String tag, double content) {
		String string = Double.toString(content);
		addSingleElementText(document, parent, tag, string);

	}
}
