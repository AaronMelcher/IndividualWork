package arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> friends = new ArrayList<Friend>();
		Random bob = new Random();
		int max = 21;
		int min = 5;
		for (int i = 0; i < 4; i++) {
			friends.add(new Friend("Yeet", min + bob.nextInt(max - min + 1)));
		}
		for (int j = 0; j < friends.size() - 1; j++) {
			System.out.println(friends.get(j).getName() + " " + friends.get(j).getAge());
		}
		System.out.println();
		Friend add = friends.remove(0);
		friends.add(3, add);
		add = friends.remove(friends.size() - 1);
		friends.set(0, add);
		for (int j = 0; j < friends.size() - 1; j++) {
			System.out.println(friends.get(j).getName() + " " + friends.get(j).getAge());
		}
	}

}
