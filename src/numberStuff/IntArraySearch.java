package numberStuff;

import java.util.Random;
import java.util.Scanner;

public class IntArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		int max = 10000;
		int min = 1;
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + bob.nextInt(max - min + 1);
		}
		System.out.println("Enter a number 1-10000");
		int search = input.nextInt();
		boolean display = false;
		for (int k : numbers) {
			if (k == search) {
				display = true;
			}
		}
		if (display == true) {
			System.out.println("Your number is in the array");
		} else {
			System.out.println("Your number is not in the array");
		}
		input.close();
	}

}
