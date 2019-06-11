package arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int ROWS = 14;
		final int COL = 9;
		int max = 100;
		int min = 0;
		int[][] num = new int[ROWS][COL];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COL; j++) {
				num[i][j] = min + bob.nextInt(max - min + 1);
			}
		}
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println(" ");
		}
		input.close();
	}
}
