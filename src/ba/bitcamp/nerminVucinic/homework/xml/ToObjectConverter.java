package ba.bitcamp.nerminVucinic.homework.xml;
import java.io.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * class used for obtaining data from XML file and then creating new objects of
 * Store type from them
 * 
 * @author nermin
 * 
 */
public class ToObjectConverter {
	/**
	 * 
	 * @param filePath
	 *            path to file where data are stored in XML format, that are
	 *            used for creating new objects of Store type (actually first
	 *            creating objects of Article type). It uses two "standard" DOM
	 *            classes, DocumentBuilder and DocumentBuilderFactory, for
	 *            parsing xml file.
	 *            @return LinkedList object consisting of Article objects that are created from data obtained from XML file
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static LinkedList<Article> convert(String filePath)
			throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilder docReader = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		// first we need object of Document type that represents entire xml
		// document
		Document xmldoc = docReader.parse(new File(filePath));
		// then we get NodeList of elements that are nested inside element and
		// which have the given tag name.
		NodeList xmlArticles = xmldoc.getElementsByTagName("article");
		// then we create LinkedList object that will represent our store
		LinkedList articles = new LinkedList<Article>();
		for (int i = 0; i < xmlArticles.getLength(); i++) {
			Node current = xmlArticles.item(i);
			if (current instanceof Element) {
				Element currentElement = (Element) current;
				String name = currentElement.getAttribute("name");
				int quantity = Integer.parseInt(currentElement
						.getAttribute("quantity"));
				double price = Double.parseDouble(currentElement
						.getAttribute("price"));
				Article article = new Article(name, quantity, price);
				articles.add(article);
			}
		}
		Iterator<Article> it = articles.iterator();
		while (it.hasNext()) {
		System.out.println(it.next().toString());
		}
		return articles;

	}

	/*
	 * public static void main(String[] args) { try { convert(); } catch
	 * (ParserConfigurationException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (SAXException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
}
