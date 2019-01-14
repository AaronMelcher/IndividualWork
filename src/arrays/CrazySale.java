package arrays;

import java.util.Random;
import java.util.Scanner;

public class CrazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int TOTAL = 25;
		double[] results = new double[TOTAL];
		int max = 100;
		int min = 0;
		double ranNum = 0;
		for (int k = 0; k < TOTAL; k++) {
			System.out.println("Enter a price:");
			results[k] = input.nextDouble();
		}
		for (int i = 0; i < TOTAL; i++) {
			ranNum = min + bob.nextInt(max - min + 1);
			results[i] = results[i] - (results[i] * (ranNum / 100));
		}
		for (int j = 0; j < TOTAL; j++) {
			System.out.print(results[j] + " ");
		}
		input.close();
	}

}
