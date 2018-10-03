package mathOperators;

import java.util.Scanner;

public class CuttingGrass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double mph;
		double deck;
		double passes;
		double timePass;
		double time;
		double pay;
		final int RATE = 12;
		System.out.println("What is the legnth of the lawn (in feet)?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn (in feet)?");
		width = input.nextDouble();
		System.out.println("What is the size of the mower deck (in inches)?");
		deck = input.nextDouble();
		System.out.println("What is the speed of the mower (in MPH)?");
		mph = input.nextDouble();
		length = length*12;
		passes = length/deck;
		width = width/5280;
		timePass = width/mph;
		time = timePass * passes;
		pay = time * RATE;
		System.out.println("It will take "+time+" hours to mow the lawn,\nand the person mowing the lawn is owed $"+pay);
		
		
		
		input.close();
	}

}
