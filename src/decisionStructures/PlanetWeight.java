package decisionStructures;

import java.util.Scanner;

public class PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		System.out.println("Choose a planet:");
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. Mars");
		System.out.println("4. Jupiter");
		System.out.println("5. Saturn");
		int planet = input.nextInt();
		switch (planet) {
		case 1:
			System.out.println("Your weight on Mercury is " + (weight * 0.37) + " lbs");
			break;
		case 2:
			System.out.println("Your weight on Venus is " + (weight * 0.88) + " lbs");
			break;
		case 3:
			System.out.println("Your weight on Mars is " + (weight * 0.38) + " lbs");
			break;
		case 4:
			System.out.println("Your weight on Jupiter is " + (weight * 2.64) + " lbs");
			break;
		case 5:
			System.out.println("Your weight on Saturn is " + (weight * 1.15) + " lbs");
			break;
		default:
			System.out.println("You didn't choose a menu choice, please try again.");
		}
		input.close();
	}
}
