package hw03;

import static hw01.XmlUtilities.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreate {
	public static void main(String[] args) throws Exception {
		Document document = create("student");

		Element student = document.getDocumentElement();
		student.setAttribute("id", "601");

		addSingleElementText(document, student, "name", "Yıldırım Gürses");
		addSingleElementText(document, student, "mark", 2.7);

		long id = getAttribute(student, "id", 0);
		String name = getSingleElementText(student, "name", "");
		double mark = getSingleElementText(student, "mark", 0);
		System.out.println(id + ": " + name + " - " + mark);

		String path = "D:\\GitHub\\IBTech\\IBTechBootcamp\\XML\\Generated.xml";
		
		dump(document, path);
	}
}
