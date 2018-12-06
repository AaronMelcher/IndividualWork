package strings;

import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		if (bob.indexOf('x') >= 0) {
			System.out.println("The letter x is at the index of " + bob.indexOf('x'));
		} else {
			System.out.println("The letter x does not appear in the sentece.");
		}
		input.close();
	}

}
