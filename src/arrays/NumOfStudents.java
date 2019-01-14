package arrays;

import java.util.Random;
import java.util.Scanner;

public class NumOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random();
		final int TOTAL = 1340;
		int max = 17;
		int min = 1;
		int[] house = new int[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			house[i] = min + bob.nextInt(max - min + 1);
		}
		for (int j = TOTAL - 1; j >= 0; j--) {
			if (house[j] > 7) {
				System.out.print(house[j] + " ");
			}
		}
		double percent = 0;
		System.out.println(" ");
		for (int k = 0; k < TOTAL; k++) {
			if (house[k] % 2 == 0) {
				percent++;
			}
		}
		System.out.println("Percent of even: " + (percent / TOTAL) * 100 + "%");
		input.close();
	}

}
