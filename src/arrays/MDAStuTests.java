package arrays;

import java.util.Random;
import java.util.Scanner;

public class MDAStuTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many students?");
		int stu = input.nextInt();
		System.out.println("How many tests were taken?");
		int test = input.nextInt();
		int max = 100;
		int min = 0;
		double avgS = 0;
		double avgT = 0;
		double avg = 0;
		int[][] scores = new int[stu][test];
		for (int i = 0; i < stu; i++) {
			for (int j = 0; j < test; j++) {
				scores[i][j] = min + bob.nextInt(max - min + 1);
			}
		}
		for (int i = 0; i < stu; i++) {
			for (int j = 0; j < test; j++) {
				avgS += scores[i][j];
			}
			System.out.println("Average of Student " + (i + 1) + ": " + avgS / test);
			avgS = 0;
		}
		for (int j = 0; j < test; j++) {
			for (int i = 0; i < stu; i++) {
				avgT += scores[i][j];
			}
			System.out.println("Average of Test " + (j + 1) + ": " + avgT / stu);
			avgT = 0;
		}
		for (int j = 0; j < stu; j++) {
			for (int i = 0; i < test; i++) {
				avg += scores[j][i];
			}
		}
		System.out.println("Average of all the tests: " + avg / (test * stu));
		input.close();
	}
}
