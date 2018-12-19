package arrays;

import java.util.Scanner;

public class StringMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int ROW = 4;
		final int COL = 3;
		String[][] names = new String[ROW][COL];
		for (int i = 0; i < ROW; i++) {
			for (int k = 0; k < COL; k++) {
				System.out.println("Enter a name:");
				names[i][k] = input.nextLine();
			}
		}
		for (int i = 0; i < ROW; i++) {
			for (int k = 0; k < COL; k++) {
				System.out.print(names[i][k] + " ");
			}
			System.out.println(" ");
		}
		input.close();
	}
}
