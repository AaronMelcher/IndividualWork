package arrays;

import java.util.Scanner;

public class StudentNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name = new String();
		final int TOTAL = 2;
		String[] full = new String[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			System.out.println("Enter a student name (First Last):");
			name = input.nextLine();
			full[i] = name;
		}
		for (int j = 0; j < TOTAL; j++) {
			name = full[j].substring(full[j].indexOf(" ")+1);
			System.out.println(full[j].charAt(full[j].indexOf(" ") - 1) + " " + name.length());
		}
		input.close();
	}
}
