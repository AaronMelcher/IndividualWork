package strings;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		int min = 0;
		int max = 9;
		System.out.println("Enter a word:");
		String bob = input.next();
		System.out.println("Enter a word:");
		String fred = input.next();
		System.out.println("Enter a word:");
		String yeet = input.next();
		int maxW = yeet.length() - 1;
		int randomNum = min + num.nextInt(maxW - min + 1);
		System.out.println("Your password is");
		System.out.print(bob.charAt(0));
		System.out.print(fred.charAt((fred.length() - 1)));
		System.out.print(yeet.charAt(randomNum));
		for (int i = 1; i <= 3; i++) {
			int ranNum = min + num.nextInt(max - min + 1);
			System.out.print(ranNum);
		}
		input.close();
	}

}
