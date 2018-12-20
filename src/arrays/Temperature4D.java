package arrays;

import java.util.Random;
import java.util.Scanner;

public class Temperature4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		int year = 10;
		int month = 12;
		int week = 4;
		int day = 7;
		int max = 110;
		int min = -20;
		int high = -21;
		int hY = 0;
		int hM = 0;
		int hW = 0;
		int hD = 0;
		int[][][][] temp = new int[year][month][week][day];
		for (int y = 0; y < year; y++) {
			for (int m = 0; m < month; m++) {
				for (int w = 0; w < week; w++) {
					for (int d = 0; d < day; d++) {
						temp[y][m][w][d] = min + bob.nextInt(max - min + 1);
					}
				}
			}
		}
		for (int y = 0; y < year; y++) {
			for (int m = 0; m < month; m++) {
				for (int w = 0; w < week; w++) {
					for (int d = 0; d < day; d++) {
						if (temp[y][m][w][d] > high) {
							high = temp[y][m][w][d];
							hY = y + 1;
							hM = m + 1;
							hW = w + 1;
							hD = d + 1;
						}
					}
				}
			}
		}
		System.out.println(
				"The highest temp was " + high + " on Year " + hY + ", month " + hM + ", week " + hW + ", day " + hD);
		input.close();
	}
}
