package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long number;
		long lastFour;
		long areaCode;
		long middle3;
		long number2;
		System.out.println("What is your phone number (no dashes)?");
		number = input.nextLong();
		lastFour = number % 10000;
		number2 = number - lastFour;
		number2 =  number2/10000;
		middle3 = number2 % 1000;
		number2 = number2 - middle3;
		areaCode = number2/1000;
		System.out.println("Your phone number is "+number);
		System.out.println("The area code is "+areaCode);
		System.out.println("The middle 3 digits are "+middle3);
		System.out.println("The last 4 digits are "+lastFour);
		input.close();
		
	}

}
