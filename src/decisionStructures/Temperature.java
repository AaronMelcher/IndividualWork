package decisionStructures;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp = input.nextInt();
		if (temp > 83) {
			System.out.println("The weather is great for swimming today.");
		} else {
			if (temp > 74) {
				System.out.println("The weather is great for playing tennis today.");
			} else {
				if (temp > 35) {
					System.out.println("The weather is great for golfing today.");
				} else {
					if (temp > -10) {
						System.out.println("The weather is great for snowshoeing today.");
					} else {
						System.out.println("It is too cold to do anything today.");
					}
				}
			}
		}
		input.close();
	}
}
