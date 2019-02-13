package file_read_write_xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_XML {

	public static void main(String[] args) {

		File fileToRead = new File("student.xml");
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder db;
		Document doc;

		try {
			db = docFactory.newDocumentBuilder();
			doc = db.parse(fileToRead);
			Element root = doc.getDocumentElement();
			System.out.println("Root Element = " + root.getNodeName());

			NodeList list = root.getElementsByTagName("student");
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				System.out.println("-----" + node.getNodeName() + "-----");
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println(element.getElementsByTagName("name")
							.item(0).getTextContent());
					System.out.println(element.getElementsByTagName("grade")
							.item(0).getTextContent());
					System.out.println(element.getElementsByTagName("age")
							.item(0).getTextContent());
				}

			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
