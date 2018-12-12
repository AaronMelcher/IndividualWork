package arrays;

import java.util.Scanner;

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends do you have?");
		int people = input.nextInt();
		input.nextLine();
		int age = 0;
		int sum = 0;
		String name = new String();
		Friend[] friends = new Friend[people];
		for (int i = 0; i < people; i++) {
			System.out.println("Enter a name (first and last):");
			name = input.nextLine();
			System.out.println("Enter their age:");
			age = input.nextInt();
			input.nextLine();
			friends[i] = new Friend(name, age);
		}
		for (int j = 0; j < people; j++) {
			name = friends[j].getName();
			sum += name.length();
		}
		System.out.println("Enter a first name to search:");
		String fn = input.nextLine();
		System.out.println("Enter their last name to search:");
		String ln = input.nextLine();
		System.out.println("Enter their age:");
		int ageS = input.nextInt();
		for(int k = 0; k < people; k++) {
			if(friends[k].search(fn, ln, ageS) == true) {
				System.out.println("These are the names that match your search criteria");
				System.out.print(friends[k].getName());
			}
		}
		System.out.println(" ");
		System.out.println("Average length: " + sum / people);
		input.close();
	}

}
