package arrays;

import java.util.Random;
import java.util.Scanner;

public class StuTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		int r = 3;
		int c = 8;
		double avg = 0;
		int tot = 0;
		int min = 90;
		int max = 100;
		int[][] scores = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				scores[i][j] = min + bob.nextInt(max - min + 1);
				avg += scores[i][j];
				tot++;
			}
		}
		avg = avg / tot;
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (scores[i][j] > avg) {
					count++;
				}
			}
		}
			System.out.println("Number of students with score greater than the average: " + count);
			input.close();
	}

}
