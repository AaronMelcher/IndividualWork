package arrays;

import java.util.Scanner;


public class ObjectArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int NUM = 5;
		String[] names = new String[NUM];
		for (int i = 0; i < NUM; i++) {
			System.out.println("Enter a name:");
			names[i] = input.nextLine();
		}
		for (int j = NUM - 1; j >= 0; j--) {
			System.out.print(names[j] + " ");
		}
		System.out.println(" ");
		System.out.println("Enter a letter");
		String end = input.nextLine();
		for (int k = 0; k < NUM; k++) {
			if (names[k].charAt(names[k].length() - 1) == end.charAt(0)) {
				System.out.print(names[k] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("Enter a first name length");
		int nameL = input.nextInt();
		int count = 0;
		for (int l = 0; l < NUM; l++) {
			if (names[l].indexOf(" ") == nameL) {
				count++;
			}
		}
		System.out.println("Number of names mathcing entered length: " + count);
		input.close();
	}
}
