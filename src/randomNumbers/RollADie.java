package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Number of sides:");
		int max = input.nextInt();
		System.out.println("Number of rolls:");
		int rolls = input.nextInt();
		int min = 1;
		for (int i = 1; i <= rolls; i++) {
			System.out.println(min + bob.nextInt(max - min + 1));
		}
		input.close();
	}
}
