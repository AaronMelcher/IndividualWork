package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String bob = input.nextLine();
		int vowels = 0;
		int con = 0;
		int punc = 0;
		for (int j = 0; j < bob.length(); j++) {
			if (bob.charAt(j) == 'a' || bob.charAt(j) == 'e' || bob.charAt(j) == 'o' || bob.charAt(j) == 'i'
					|| bob.charAt(j) == 'u') {
				vowels++;
				if(bob.charAt(j) == ' ' || bob.charAt(j) == '.' || bob.charAt(j) == ',') {
					punc++;
				}
			} else {
				con++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + con);
		System.out.println("Number of punctuation marks: " + punc);
		input.close();
	}

}
