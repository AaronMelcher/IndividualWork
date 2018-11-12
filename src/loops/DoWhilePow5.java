package loops;

import java.util.Scanner;

public class DoWhilePow5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num = input.nextDouble();
		do {
			System.out.println("Number to power of 5: "+Math.pow(num, 5));
			System.out.println("Enter a number (9999 to quit):");
			num = input.nextInt();
		} while ( Math.abs(num - 9999) > 0.001); // don't compare doubles for equality
		{

		}
		input.close();
	}

}
