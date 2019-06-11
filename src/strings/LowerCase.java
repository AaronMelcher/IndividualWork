package strings;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		System.out.println(bob.toLowerCase());
		System.out.println(bob);
		input.close();
	}

}
