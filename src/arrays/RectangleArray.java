package arrays;

import java.util.Random;
import java.util.Scanner;
import objectOrientedProgramming.Rectangle;

public class RectangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int TOTAL = 5;
		int min = 10;
		int max = 56;
		Rectangle[] fred = new Rectangle[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			fred[i] = new Rectangle(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1));
		}
		for (int j = 0; j < TOTAL; j++) {
			System.out.println("Length: " + fred[j].getLength() + " Width: " + fred[j].getWidth());
			System.out.println("Area: " + fred[j].area());
		}
		input.close();
	}

}
