package strings;

import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name:");
		String bob = input.nextLine();
		System.out.println("Enter a name:");
		String fred = input.nextLine();
		if (bob.compareTo(fred) == 0) {
			System.out.println("The names are the same");
		} else {
			if (bob.compareTo(fred) > 0) {
				System.out.println(bob + " comes behind " + fred + " in alphabetical order.");
			} else {
				System.out.println(fred + " comes behind " + bob + " in alhpabetical order.");
			}
		}
		input.close();
	}

}
