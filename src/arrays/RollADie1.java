package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollADie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int TOTAL = 10000;
		int[] results = new int[TOTAL];
		int max = 6;
		int min = 1;
		boolean contin = true;
		for (int i = 0; i < TOTAL; i++) {
			results[i] = min + bob.nextInt(max - min + 1);
		}
		do{
			System.out.println("Enter a number 1-6:");
		int num = input.nextInt();
		int count = 0;
		for (int j = 0; j < TOTAL; j++) {
			if (results[j] == num) {
				count++;
			}
		}
		System.out.println("There was " + count + " instances of " + num);
		System.out.println("Do you wish to continue? (true or false)");
		contin = input.nextBoolean();
	}while(contin);
		input.close();
}
}