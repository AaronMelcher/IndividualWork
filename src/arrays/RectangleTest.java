package arrays;

import java.util.Random;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		System.out.println("Enter a number:");
		int L = input.nextInt();
		System.out.println("Enter another number:");
		int W = input.nextInt();
		int max = 100;
		int min = 1;
		Rectangle[][] shape = new Rectangle[L][W];
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < W; j++) {
				shape[i][j] = new Rectangle(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1));
			}
		}
		double sum = 0;
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < W; j++) {
				sum += shape[i][j].perimeter();
			}
		}
		System.out.println("The sum of the perimeters is " + sum);
		input.close();
	}
}
