package strings;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean test = false;
		System.out.println("Enter a password:");
		String bob = input.nextLine();
		do {
			System.out.println("Please verify your password:");
			String fred = input.nextLine();
			if (bob.equals(fred) == true) {
				test = true;
			} else {
				System.out.println("Please try again");
			}
		} while (test == false);
		System.out.println("Thank you for verifying your password.");
		input.close();
	}

}
