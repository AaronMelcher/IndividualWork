package decisionStructures;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number 1:");
		double a = input.nextDouble();
		System.out.println("Number 2:");
		double b = input.nextDouble();
		System.out.println("Select an operation to preform:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Number 1 Squared");
		int operation = input.nextInt();
		switch (operation) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a / b);
			break;
		case 5:
			System.out.println(Math.pow(a, 2));
			break;
		default:
			System.out.println("You didn't select a menu choice, try again.");
			break;
		}
		input.close();
	}

}
