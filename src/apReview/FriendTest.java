package apReview;

import java.util.*;

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for (int i = 0; i < 13; i++) {
			System.out.println("Enter a name:");
			String name = input.nextLine();
			System.out.println("Enter an age:");
			int age = input.nextInt();
			friends.add(new Friend(name, age));
			input.nextLine();
		}
		for (int i = friends.size() - 1; i >= 0; i--) {
			System.out.print(friends.get(i).getName());
			System.out.print("Years until retirement: " + (65 - friends.get(i).getAge()));
			System.out.println();
		}
		input.close();
	}

}
