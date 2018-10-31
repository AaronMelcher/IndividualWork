package decisionStructures;

import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Weight:");
		int weight = input.nextInt();
		System.out.println("Age:");
		int age = input.nextInt();
		System.out.println("Do you smoke (true or false)?");
		boolean smoke = input.nextBoolean();
		double cost = 200;
		if (weight >= 700) {
			cost += 300;
		}
		if (age >= 75) {
			cost += 125;
		} else {
			if (age <= 30)
				cost -= 25;
		}
		if (smoke == true) {
			cost += 50;
		} else {
			cost -= 40;
		}
		System.out.println("Your cost: $" + cost);
		input.close();
	}

}
