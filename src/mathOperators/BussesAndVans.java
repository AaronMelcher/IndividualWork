package mathOperators;

import java.util.Scanner;

public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = -999;
		int bus = -999;
		int leftOver = -999;
		final int busCap = 35;
		System.out.println("How many people do you have?");
		people = input.nextInt();
		bus = people/busCap;
		leftOver = people%busCap;
		System.out.println("You will need " + bus + " buses," );
		System.out.println("and you will need vans for " + leftOver + " people");
		input.close();
			
		
	}

}
