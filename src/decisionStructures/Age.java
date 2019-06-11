package decisionStructures;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You will be charged as an adult.");
		}
		System.out.println("Have a nice day!");
		input.close();
	}
}
