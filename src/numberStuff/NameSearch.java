package numberStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			names.add("Bob" + i);
		}
		System.out.println("Enter a name:");
		String choice = input.nextLine();
		for (String temp : names) {
			if (choice.equals(temp) == true) {
				System.out.println("That name is in the array.");
			}
		}
		input.close();
	}

}
