package objectOrientedProgramming;

import java.util.Scanner;

public class HITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		HomeImprovement bob = new HomeImprovement();
		bob.fill1();
		System.out.println("Enter the legnth(ft):");
		double length1 = input.nextDouble();
		System.out.println("Enter the width(ft):");
		double width1 = input.nextDouble();
		System.out.println("Enter the depth(ft):");
		double depth1 = input.nextDouble();
		System.out.println("Ammount of sand (cubic feet) transported per hour:");
		double sand1 = input.nextDouble();
		bob.fill2(length1, width1, depth1, sand1);
		System.out.println("Enter the legnth(ft):");
		double length2 = input.nextDouble();
		System.out.println("Enter the width(ft):");
		double width2 = input.nextDouble();
		System.out.println("Enter the depth(ft):");
		double depth2 = input.nextDouble();
		System.out.println("Ammount of sand (cubic feet) transported per hour:");
		double sand2 = input.nextDouble();
		double rate = bob.fill3(length2, width2, depth2, sand2);
		System.out.println("The time it will take to fill the sandbox is " + rate + " hours");
	}

}
