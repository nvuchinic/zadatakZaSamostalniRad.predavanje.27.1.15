package ba.bitcamp.nerminVucinic.homework.xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * class for testing all the other classes and their methods
 * @author nermin
 *
 */
public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Article a1 = new Article("coffee", 100, 5);
		Article a2 = new Article("milk", 100, 2);
		Article a3 = new Article("sugar", 100, 2);
		Article a4 = new Article("wheat", 100, 5);
		Article a5 = new Article("olive oil", 100, 5);
		Article a6 = new Article("orange", 100, 2);
		Article a7 = new Article("apple juice", 100, 2);
		Article a8 = new Article("tea", 100, 3);
		Article a9 = new Article("soap", 100, 1);
		Article a10 = new Article("soya", 100, 5);
		Store store = new Store();
		store.addArticle(a1);
		store.addArticle(a2);
		store.addArticle(a3);
		store.addArticle(a4);
		store.addArticle(a5);
		store.addArticle(a6);
		store.addArticle(a7);
		store.addArticle(a8);
		store.addArticle(a9);
		store.addArticle(a10);

		Iterator<Article> it = store.articles.iterator();
		int counter = 0;
		while (it.hasNext()) {
			counter++;
			Article temp = it.next();
			System.out.println(counter + ") " + temp.toString());
		}
		String filePath = "D:\\AndroidDevelopment\\JAVA DEVELOPMENT\\zadatakZaSamostalniRad.predavanje.27.1.15\\Files\\storeToXml.xml";
		ToXMLconverter.convert(store.articles,filePath);
		try {
			ToObjectConverter.convert(filePath);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
