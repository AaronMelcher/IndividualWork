package arrays;

import java.util.Random;
import java.util.Scanner;

public class MultiRollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Number of students:");
		int stu = input.nextInt();
		System.out.println("Number of sides on the die:");
		int max = input.nextInt();
		int min = 1;
		System.out.println("How many times will each student roll the die?");
		int rolls = input.nextInt();
		int[][] test = new int[stu][rolls];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++) {
				test[i][j] = min + bob.nextInt(max - min + 1);
			}
		}
		int k = 0;
		for(int i = 0; i < test.length; i++) {
			System.out.println(" ");
			System.out.println("Student "+ (k+1) + ": " + test[i][k] + " ");
			k++;
		}
		System.out.println(" ");
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++) {
				System.out.print(test[i][j] + " ");
			}
		}
		input.close();
	}
}
