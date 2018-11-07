package loops;

import java.util.Scanner;

public class LargeSmallTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int high = 0;
		int low = 999;
		int sum = 0;
		System.out.println("Input a test score (9999 to terminate):");
		int score = input.nextInt();
		while (score != 9999) {
			if (score > high) {
				high = score;
			}
			if (score < low) {
				low = score;
			}
			sum += score;
			System.out.println("Input a test score (9999 to terminate):");
			score = input.nextInt();
			count++;
		}
		System.out.println("Highest: " + high);
		System.out.println("Lowest: " + low);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum / count);
		input.close();
	}

}
