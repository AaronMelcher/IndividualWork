package designingClasses;

public class Book {
	private String title;
	private int pages;

	public Book() {
		title = "yeet";
		pages = 69;
	}

	public Book(String xTitle, int xPages) {
		title = xTitle;
		pages = xPages;
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return pages;
	}
}
