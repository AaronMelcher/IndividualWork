package strings;

import java.util.Scanner;

public class LengthActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		int length = bob.length();
		for (int j = 0; j <= length - 1; j++) {
			System.out.println(bob.charAt(j));
		}
		input.close();
	}

}
