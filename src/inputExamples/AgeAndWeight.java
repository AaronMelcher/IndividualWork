package inputExamples;

import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		double weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println("You are "+ age + " years old and weight "+ weight +" pounds.");
		input.close();
	}

}
