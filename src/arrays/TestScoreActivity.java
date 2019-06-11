package arrays;

import java.util.Scanner;

public class TestScoreActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0;
		double largest = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter a test score:");
			scores[i] = input.nextDouble();
			if (scores[i] > largest) {
				largest = scores[i];
			}
		}
		for (int j = 0; j < scores.length; j++) {
			System.out.print(scores[j] + " ");
		}
		System.out.println(" ");
		for (int l = scores.length - 1; l >= 0; l--) {
			System.out.print(scores[l] + " ");
		}
		for (int k = 0; k < scores.length; k++) {
			sum += scores[k];
		}
		System.out.println(" ");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum / 5);
		System.out.println("Largest: " + largest);
		input.close();
	}
}