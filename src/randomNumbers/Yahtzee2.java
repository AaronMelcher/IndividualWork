package randomNumbers;

import java.util.Random;

public class Yahtzee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int min = 1;
		int max = 6;
		int rolls = 0;
		int yahtzee = 0;
		while (yahtzee < 100) {
			int num1 = min + bob.nextInt(max - min + 1);
			int num2 = min + bob.nextInt(max - min + 1);
			int num3 = min + bob.nextInt(max - min + 1);
			int num4 = min + bob.nextInt(max - min + 1);
			int num5 = min + bob.nextInt(max - min + 1);
			rolls++;
			if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
				yahtzee++;
			}
		}
		System.out.println("Took " + rolls + " rolls to get 100 yahtzee");
	}

}
