package designingClasses;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;

	public Library() {
		name = "Big Boi Library";
		for (int i = 0; i < 10; i++) {
			books.add(new Book());
		}
	}

	public Library(String xName, ArrayList<Book> xBook) {
		name = xName;
		books = xBook;
	}

	public Book checkOut(int num) {
		Book temp = books.get(num);
		books.remove(num);
		return temp;
	}

	public void returnBook(Book temp) {
		books.add(temp);
	}

	public String fire() {
		books.clear();
		return name + " burned down, there are no more books.";
	}
}
