package hw02;

import static hw01.XmlUtilities.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlParse {
	public static void main(String[] args) throws Exception {
		String path = "D:\\GitHub\\IBTech\\IBTechBootcamp\\XML\\Students.xml";
		Document document = parse(path);
		
		Element students = document.getDocumentElement();
		
		NodeList studentList = students.getElementsByTagName("student");
		for (int i = 0; i < studentList.getLength(); i++) {
			Element student = (Element) studentList.item(i);
			
			String name = getSingleElementText(student, "name", "");
			String mark = getSingleElementText(student, "mark", "");
			String id = getAttribute(student, "id", "");
			System.out.println(id+ "- " + name + ": " + mark);
			
		}
		
	}
}
