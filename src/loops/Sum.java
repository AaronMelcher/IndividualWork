package loops;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = input.nextInt();
		System.out.println("Enter another number:");
		int num2 = input.nextInt();
		do {
			System.out.println("Sum: "+(num1+num2));
			System.out.println("Enter a number:");
			num1 = input.nextInt();
			System.out.println("Enter another number:");
			num2 = input.nextInt();
		} while (num1 != 999);
		{

		}
		input.close();
	}

}
