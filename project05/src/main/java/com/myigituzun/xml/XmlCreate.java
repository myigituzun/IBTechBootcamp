package com.myigituzun.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static com.myigituzun.xml.XmlUtilities.*;

public class XmlCreate {
	public static void main(String[] args) throws Exception {
		Document document = create("employee");

		Element employee = document.getDocumentElement();
		employee.setAttribute("id", "401");

		addSingleElementText(document, employee, "name", "Neşet Ertaş");
		addSingleElementText(document, employee, "salary", 9899);

		long id = getAttribute(employee, "id", 0);
		String name = getSingleElementText(employee, "name", "");
		double salary = getSingleElementText(employee, "salary", 0);
		System.out.println(id + ": " + name + " - " + salary);

		String path = "D:\\GitHub\\IBTech\\IBTechBootcamp\\XML\\Dump.xml";
		
		dump(document, path);
	}
}
