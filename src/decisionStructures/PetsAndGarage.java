package decisionStructures;

import java.util.Scanner;

public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many pets do you have?");
		int pets = input.nextInt();
		System.out.println("How many cares can fit in your garage?");
		int cars = input.nextInt();
		System.out.println(pets >= 5 || cars > 3);
		input.close();
	}

}
