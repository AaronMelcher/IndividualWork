package arrays;

import java.util.Random;
import java.util.Scanner;

public class MDAFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		final int ROW = 18;
		final int COL = 5;
		int max = 100;
		int min = 0;
		Friend[][] age = new Friend[ROW][COL];
		for (int i = 0; i < ROW; i++) {
			for (int k = 0; k < COL; k++) {
				age[i][k] = new Friend("a" ,min + bob.nextInt(max - min + 1));
			}
		}
		for (int i = 0; i < ROW; i++) {
			for (int k = 0; k < COL; k++) {
				System.out.print(age[i][k].getAge() + " ");
			}
			System.out.println(" ");
		}
		input.close();
	}
}
