package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		Scanner input = new Scanner(System.in);
		names.add("Bob");
		names.add("Jane");
		names.add(1, "Billy");
		System.out.println("Enter your name");
		names.add(input.nextLine());
		friends.add(new Friend("Yeet", 9));
		friends.add(0, new Friend("Deep", 79));
		friends.add(0, new Friend("OmegaLul", 70));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names);
		input.close();
	}

}
