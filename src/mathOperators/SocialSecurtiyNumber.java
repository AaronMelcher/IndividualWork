package mathOperators;

import java.util.Scanner;

public class SocialSecurtiyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		int number;
		int lastFour;
		int ageTo;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your social security number?");
		number = input.nextInt();
		lastFour = number % 10000;
		ageTo = 18-age;
		System.out.println("You are "+age+" years old.");
		System.out.println("You will be 18 in "+ageTo+" years.");
		System.out.println("The last four digits are " + lastFour);
		input.close();
		
	}

}
