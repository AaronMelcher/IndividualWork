package decisionStructures;

import java.util.Scanner;

public class PromotionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Age:");
		int age = input.nextInt();
		System.out.println("Years of experience:");
		double experience = input.nextDouble();
		System.out.println("Height (in):");
		double height = input.nextDouble();
		if (age >= 50 && Math.abs(experience - 10.5) <= 0.001 && height < 70) {
			System.out.println("You are getting a promotion.");
		} else {
			if (age >= 50 && Math.abs(experience - 10.5) <= 0.001 && height > 80) {
				System.out.println("You are getting a promotion.");
			} else {
				if (age < 50 && height > 70 && height < 80) {
					System.out.println("You are getting a promotion");
				} else {
					System.out.println("You are not getting a promotion.");
				}
			}
		}
		input.close();
	}

}
