package arrays;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int TOTAL = 10;
		int[] scores = new int[TOTAL];
		int highest = 0;
		int lowest = 999;
		double average = 0;
		for (int i = 0; i < TOTAL; i++) {
			System.out.println("Enter a test score:");
			scores[i] = input.nextInt();
			if (scores[i] > highest) {
				highest = scores[i];
			}
			if (scores[i] < lowest) {
				lowest = scores[i];
			}
			average += scores[i];
		}
		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);
		System.out.println("Average: " + average / TOTAL);
		for (int j = 0; j < TOTAL; j++) {
			System.out.print(scores[j] + " ");
		}
		input.close();
	}

}
