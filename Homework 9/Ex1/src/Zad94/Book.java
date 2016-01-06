package Zad94;

public class Book {

	private String name;
	private String author;
	private int numPages;

	public Book() {
		super();
	}

	public Book(String name, String author, int numPages) {
		super();
		this.name = name;
		this.author = author;
		this.numPages = numPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		if (numPages > 0) {
			this.numPages = numPages;
		}
	}
	
	
	
}
