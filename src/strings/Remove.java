package strings;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		for (int j = 0; j < bob.length(); j++) {
			if (bob.charAt(j) != 'a' && bob.charAt(j) != ' ') {
				System.out.print(bob.charAt(j));
			}
		}
		System.out.println();
		System.out.println(bob);
		input.close();
	}

}
