package Zad94;

import java.util.HashMap;

public class Library {
	
	private String name;
	private String address;
	private HashMap<Book,Integer> books = new HashMap<Book, Integer>();

	public Library() {
		super();
	}
	
	public Library(String name, String address, HashMap<Book, Integer> books) {
		super();
		this.name = name;
		this.address = address;
		this.books = books;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public HashMap<Book, Integer> getBooks() {
		return books;
	}

	public void setBooks(HashMap<Book, Integer> books) {
		this.books = books;
	}

	public void addCopy (Book book1) {
		if(books.containsKey(book1)) {
			Integer count = books.get(book1);
			books.put(book1,  count++);
		} else { 
			books.put(book1, 1);
		}
	}
	
	public void removeCopy(Book book1) {
		if(books.containsKey(book1)) {
			Integer count = books.get(book1);
			if(count > 0) {
				books.put(book1, count--);
			}
		}
	}

}
