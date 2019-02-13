package from_juno;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TestXML {
	public TestXML() {
		super();
	}

	public static void getValues() {
		try {

			DocumentBuilderFactory domFactory =

			DocumentBuilderFactory.newInstance();

			domFactory.setNamespaceAware(true);

			DocumentBuilder builder = domFactory.newDocumentBuilder();

			Document doc = builder.parse("c:/df_newco_my_credentials.xml");
			NodeList nl = doc.getElementsByTagName("wcm:element");
			for (int i = 0; i < nl.getLength(); i++) {
				Element e = (Element) nl.item(i);
				System.out.println(e.getAttribute("name"));
			}
		} catch (Exception e) {

			System.out.println(e);

		}

	}

	public static void main(String[] args) {
		TestXML testXML = new TestXML();
		getValues();
	}
}
