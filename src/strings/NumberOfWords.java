package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		int words = 0;
		for (int j = 0; j < bob.length(); j++) {
			if(bob.charAt(j) != ' ') {
				System.out.print(bob.charAt(j));
			}
			else {
				words++;
				System.out.println("");
			}
		}
		System.out.println("Number of words: "+words);
		input.close();
	}

}
