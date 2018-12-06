package arrays;

import java.util.Scanner;

public class TestScoreActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a test score:");
			scores[i] = input.nextDouble();
		}
		for (int j = 0; j < 5; j++) {
			System.out.println(scores[j] + " ");
		}
		input.close();
	}
}
