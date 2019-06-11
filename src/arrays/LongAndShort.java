package arrays;

import java.util.Scanner;

public class LongAndShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 0;
		String shortest = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String longest = new String();
		int range = 0;
		System.out.println("How many people do you know?");
		people = input.nextInt();
		input.nextLine();
		String[] names = new String[people];
		for (int i = 0; i < people; i++) {
			System.out.println("Enter a name:");
			names[i] = input.nextLine();
		}
		for (int j = 0; j < people; j++) {
			if (names[j].length() > longest.length()) {
				longest = names[j];
			}
			if (names[j].length() < shortest.length()) {
				shortest = names[j];
			}
		}
		range = longest.length() - shortest.length();
		for (int k = 0; k < people; k++) {
			System.out.print(names[k] + " ");
		}
		System.out.println(" ");
		System.out.println("Longest: " + longest);
		System.out.println("Shortest: " + shortest);
		System.out.println("Range: " + range);
		input.close();
	}
}
