package com.myigituzun.xml;

import org.w3c.dom.Document;

import org.w3c.dom.Element;
import static com.myigituzun.xml.XmlUtilities.*;

public class XmlBuild {
	public static void main(String[] args) throws Exception {
		String path = "D:\\GitHub\\IBTech\\IBTechBootcamp\\XML\\Product.xml";
		Document document = parse(path);

		Element productElement = document.getDocumentElement();
		String id = productElement.getAttribute("id");
		System.out.println(id);

		String name = getSingleElementText(productElement, "name", "");
		double price = getSingleElementText(productElement, "price", 0);
		System.out.println(name + ": " + price);

	}
}
