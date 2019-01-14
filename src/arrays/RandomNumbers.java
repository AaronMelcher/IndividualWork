package arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int TOTAL = 10000;
		int[] results = new int[TOTAL];
		int max = 100;
		int min = 1;
		int num;
		int count = 0;
		for(int i = 0; i < TOTAL; i++) {
			results[i] = min + bob.nextInt(max - min + 1);
		}
		System.out.println("Enter a number 1-100");
		num = input.nextInt();
		for(int j = 0; j < TOTAL; j++) {
			if(num == results[j]) {
				count++;
			}
		}
		System.out.println("There was " + count + " instances of " + num);
		input.close();
	}

}
