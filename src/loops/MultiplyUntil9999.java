package loops;

import java.util.Scanner;

public class MultiplyUntil9999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number:");
		num = input.nextInt();
		while (num != 9999) {
			System.out.println("Number times 2: "+ num*2);
			System.out.println("Enter another number:");
			num = input.nextInt();
		}
		input.close();
	}

}
