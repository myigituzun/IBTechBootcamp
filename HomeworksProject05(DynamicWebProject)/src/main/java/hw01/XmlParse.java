package hw01;

import static hw01.XmlUtilities.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlParse {
	public static void main(String[] args) throws Exception {
		String path = "D:\\GitHub\\IBTech\\IBTechBootcamp\\XML\\Student.xml";
		Document document = parse(path);

		Element studentElement = document.getDocumentElement();
		long id = getAttribute(studentElement, "id", 0);
		System.out.println(id);

		String name = getSingleElementText(studentElement, "name", "");
		double price = getSingleElementText(studentElement, "mark", 0);
		System.out.println(name + ": " + price);

	}
}
