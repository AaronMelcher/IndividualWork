package decisionStructures;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int MAGIC = 708;
		System.out.println("What is the magic number??");
		int number = input.nextInt();
		if (number == MAGIC) {
			System.out.println("You got it right!\nYou've won $1.6 billion!");
		}
		System.out.println("Have a nice day!");
		input.close();
	}

}
