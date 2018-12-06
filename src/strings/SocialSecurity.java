package strings;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your social security number (no dashes):");
		String bob = input.nextLine();
		System.out.println(bob.substring(5));
		System.out.println(bob.substring(3, 5));
		System.out.println(bob.substring(0, 3));
		input.close();
	}

}
