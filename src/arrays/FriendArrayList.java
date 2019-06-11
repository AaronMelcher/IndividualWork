package arrays;

import java.util.ArrayList;

public class FriendArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("Yeet", 9));
		friends.add(0, new Friend("Deep", 79));
		friends.add(0, new Friend("OmegaLul", 70));
		for (int i = 0; i < friends.size(); i++) {
			Friend temp = friends.get(i);
			System.out.println(temp.getName() + " " + temp.getAge());
		}
	}

}
