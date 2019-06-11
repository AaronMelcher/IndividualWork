package mathOperators;

import java.util.Scanner;

public class AgeActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("How old are you?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("You will be "+ age +" years old in 7 years.");
		input.close();
		
	}

}
