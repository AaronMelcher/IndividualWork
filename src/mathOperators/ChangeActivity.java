package mathOperators;

import java.util.Scanner;

public class ChangeActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double change = -999.99;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		System.out.println("How much change do you have?");
		change = input.nextDouble();
		dollars = (int)change;
		change = change-dollars;
		quarters = (int)Math.floor((change/.25));
		change = change-.25*quarters;
		dimes = (int)Math.floor((change/.1));
		change = change - .1*dimes;
		nickels = (int)Math.floor((change/0.5));
		change = change-.5*nickels;
		pennies = (int)Math.round((change/.01));
		System.out.println("You'll need "+ dollars +" dollars, "+quarters+" quarters, "+dimes+ " dimes, "+nickels+" nickels, "+pennies+" pennies.");
		input.close();
		
		
	}

}
