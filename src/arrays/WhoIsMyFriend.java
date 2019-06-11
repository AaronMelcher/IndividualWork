package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhoIsMyFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> yeet = new ArrayList<Friend>();
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		int max = 2;
		int min = 1;
		String name = new String();
		int age = 0;
		System.out.println("How many friends do you have?");
		int num = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter their name:");
			name = input.nextLine();
			System.out.println("Enter their age:");
			age = input.nextInt();
			input.nextLine();
			yeet.add(new Friend(name, age));
		}
		int event = min + bob.nextInt(max - min + 1);
		if (event == 1) {
			int size = yeet.size();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter their name:");
				name = input.nextLine();
				System.out.println("Enter their age:");
				age = input.nextInt();
				input.nextLine();
				yeet.add(new Friend(name, age));
			}
		}
		if (event == 2) {
			Friend left = yeet.get(0 + bob.nextInt((yeet.size() - 1) - 0 + 1));
			yeet.clear();
			yeet.add(left);
		}
		for (int k = 0; k < yeet.size(); k++) {
			System.out.println(yeet.get(k).getName() + " " + yeet.get(k).getAge());
		}
		input.close();
	}

}
