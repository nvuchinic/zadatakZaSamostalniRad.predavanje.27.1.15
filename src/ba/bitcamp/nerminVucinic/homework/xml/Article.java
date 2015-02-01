package ba.bitcamp.nerminVucinic.homework.xml;
public class Article {
	private String name;
	private int quantity;
	private double price;

	/**
	 * class for representing article in store. It has standard methods(constructor and getters and setters)
	 * @param name name of the article
	 * @param quantity quantity of the article
	 * @param price price of the article
	 */
	public Article(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Article [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

}
