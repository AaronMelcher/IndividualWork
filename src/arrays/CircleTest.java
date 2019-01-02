package arrays;

import java.util.Random;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int max = 100;
		int min = 1;
		double sum = 0;
		Circle[] rad = new Circle[num];
		for (int i = 0; i < num; i++) {
			rad[i] = new Circle(min + bob.nextInt(max - min + 1));
		}
		for (int j = 0; j < num; j++) {
			sum += rad[j].area();
		}
		System.out.println("Sum of the areas: " + sum);
		input.close();
	}

}
