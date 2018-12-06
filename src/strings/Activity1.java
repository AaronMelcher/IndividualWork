package strings;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		System.out.println("Bob is in the sentence: "+bob.contains("Bob"));
		System.out.println(bob.charAt(0));
		System.out.println(bob.charAt(2));
		System.out.println(bob);
		input.close();
	}

}
