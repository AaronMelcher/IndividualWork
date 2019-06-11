package wrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class NameProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a name:");
			names.add(input.nextLine());
		}
		String small = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		for (String temp : names) {
			if (temp.length() < small.length()) {
				small = temp;
			}
		}
		System.out.println("Shortest name length = " + small.length());
		input.close();
	}

}
