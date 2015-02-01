package ba.bitcamp.nerminVucinic.homework.xml;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * class that is used for representing object of type Store (linked list of
 * objects of Article type) in form of XML file.
 * 
 * @author nermin
 * 
 */
public class ToXMLconverter {

	/**
	 * method used for presenting object of Store type in XML format.
	 * 
	 * @param articles
	 *            list of objects of Article type
	 * @throws FileNotFoundException
	 */
	public static void convert(LinkedList articles,String filePath)
			throws FileNotFoundException {
		/*FileOutputStream fos = new FileOutputStream(
				"D:\\AndroidDevelopment\\JAVA DEVELOPMENT\\zadatakZaSamostalniRad.predavanje.27.1.15\\Files\\storeToXml.xml");*/
		FileOutputStream fos = new FileOutputStream(filePath);
		PrintWriter pw = new PrintWriter(fos);
		pw.println("<?xml version=\"1.0\"?>");
		pw.println("<store>");
		Iterator<Article> it = articles.iterator();
		while (it.hasNext()) {
			Article temp = it.next();
			pw.println(" <article name = '" + temp.getName() + "' quantity = '"
					+ temp.getQuantity() + "' price = '" + temp.getPrice()
					+ "' >");

			pw.println("</article>");
		}
		pw.println("</store>");
		pw.flush();
	}

}
