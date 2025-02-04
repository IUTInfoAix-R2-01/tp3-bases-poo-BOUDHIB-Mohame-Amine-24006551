
public class Book {
	private String name;
	private Author[] authors;
	private double price; 
	private int qty = 0;
	private Author[] listAuthors;
	
	public Book (String name, Author[] authors, double price) { 
		this.name = name;
		this.authors = authors;
		this.price = price;
		
	}
	public Book (String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book[name=" + name + ", authors=" + authors + ", price=" + price + ", qty=" + qty + "]";
	}
	public String getAuthorsNames() {
		for (int i = 0; i < authors.length; ++i)
		   listAuthors[i] = authors[i].getName();  // cannot use author.name as name is private in Author class
	}
}
