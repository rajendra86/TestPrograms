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

public class FileReadWriteXml {
	private DocumentBuilderFactory docFactory = null;
	private DocumentBuilder builder = null;
	private File fileToRead = null;
	private Document doc = null;

	public static void main(String[] args) {
		FileReadWriteXml filereadwrite = new FileReadWriteXml();
		filereadwrite.fileRead();
	}

	/**
	 * This method is used to read the XML file.
	 */
	public void fileRead() {
		fileToRead = new File("staff.xml");
		builder = getDocumentbuilder();

		if (null != builder) {
			try {
				doc = builder.parse(fileToRead);
				System.out.println("Root element :"
						+ doc.getDocumentElement().getNodeName());

				NodeList nList = doc.getElementsByTagName("staff");

				for (int i = 0; i < nList.getLength(); i++) {
					Node node = nList.item(i);
					System.out.println("----------------------------");
					System.out.println("Current Element : "
							+ node.getNodeName());

					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) node;

						System.out.println("Staff id : "
								+ eElement.getAttribute("id"));
						System.out.println("First Name : "
								+ eElement.getElementsByTagName("firstname")
										.item(0).getTextContent());
						System.out.println("Last Name : "
								+ eElement.getElementsByTagName("lastname")
										.item(0).getTextContent());
						System.out.println("Nick Name : "
								+ eElement.getElementsByTagName("nickname")
										.item(0).getTextContent());
						System.out.println("Salary : "
								+ eElement.getElementsByTagName("salary")
										.item(0).getTextContent());
					}
				}

			} catch (SAXException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	/**
	 * This method is used to write the XML file.
	 */
	public void fileWrite() {

	}

	/**
	 * Method to return DocumentBuilder instance
	 * 
	 * @throws ParserConfigurationException
	 */

	public DocumentBuilder getDocumentbuilder() {

		try {
			docFactory = DocumentBuilderFactory.newInstance();
			builder = docFactory.newDocumentBuilder();
			return builder;
		} catch (ParserConfigurationException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
}
