package arrays;

import java.util.Random;
import java.util.ArrayList;

public class ArrayListRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
		int max = 70;
		int min = 50;
		for (int i = 0; i < 400; i++) {
			shapes.add(new Rectangle(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1)));
		}
		for (int j = shapes.size() - 1; j >= 0; j--) {
			System.out.println(shapes.get(j).area());
		}
	}
}
