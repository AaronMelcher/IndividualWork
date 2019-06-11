package decisionStructures;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Age:");
		int age = input.nextInt();
		System.out.println("GPA:");
		double gPA = input.nextDouble();
		if (gPA + age > 20) {
			System.out.println("You will recieve $250");
		}
		if (gPA + age <= 20) {
		System.out.println("You will recieve $30");
	}	
		input.close();
	}
	}

