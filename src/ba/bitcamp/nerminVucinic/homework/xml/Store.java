package ba.bitcamp.nerminVucinic.homework.xml;
import java.util.LinkedList;

/**
 * class for representing simple store. It has just one field, it consists of list (linked) of article objects.
 * It has method for adding article objest to list
 * @author nermin
 *
 */
public class Store {
	LinkedList<Article> articles;

	public Store() {
		super();
		articles = new LinkedList<Article>();
	}

	public void addArticle(Article a) {
		articles.add(a);
	}
}
