package randomNumbers;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int min = 1;
		int max = 6;
		boolean yahtzee = false;
		while (yahtzee == false) {
			int num1 = min + bob.nextInt(max - min + 1);
			int num2 = min + bob.nextInt(max - min + 1);
			int num3 = min + bob.nextInt(max - min + 1);
			int num4 = min + bob.nextInt(max - min + 1);
			int num5 = min + bob.nextInt(max - min + 1);
			if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
				yahtzee = true;
			}
		}
		System.out.println("You got yahtzee!");
	}
}
