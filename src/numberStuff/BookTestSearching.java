package numberStuff;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookTestSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<Book>();
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		int max = 200;
		int min = 100;
		for (int i = 0; i < 10; i++) {
			library.add(new Book("Bob" + 1, min + bob.nextInt(max - min + 1)));
		}
		System.out.println("Enter a book title:");
		String title = input.nextLine();
		System.out.println("Enter the number of pages:");
		int pages = input.nextInt();
		int count = 0;
		boolean display = false;
		for (Book temp : library) {
			if (temp.getPages() == pages) {
				count++;
			}
			if (temp.getTitle().length() == title.length()) {
				display = true;
			}
			if (temp.getTitle().equals(title) == true && temp.getPages() == pages) {
				System.out.println("Your book is in the array list!");
			}
		}
		if (display == true) {
			System.out.println("A book title is the same length as your title!");
		}
		System.out.println("This many books have the same number of pages that you inputed: " + count);
		input.close();
	}

}
