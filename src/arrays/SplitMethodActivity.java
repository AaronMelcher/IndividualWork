package arrays;

import java.util.Scanner;

public class SplitMethodActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sen = input.nextLine();
		System.out.println("Enter a keyword:");
		String key = input.nextLine();
		int count = 0;
		String[] words = sen.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
		}
		for (int j = 0; j < words.length; j++) {
			if (words[j].equals(key)) {
				count++;
			}
		}
		System.out.println("The key word appears " + count + " times");
		input.close();
	}

}
