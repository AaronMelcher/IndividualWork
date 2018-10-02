package mathOperators;

import java.util.Scanner;

public class CuttingGrass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double lenght;
		double width;
		double mph;
		double deck;
		double area;
		double time;
		double totPay;
		double grassCut;
		final int RATE = 12;
		System.out.println("What is the legnth of the lawn (in feet)?");
		lenght = input.nextDouble();
		System.out.println("What is the width of the lawn (in feet)?");
		width = input.nextDouble();
		System.out.println("What is the size of the mower deck (in inches)?");
		deck = input.nextDouble();
		System.out.println("What is the speed of the mower (in MPH)?");
		mph = input.nextDouble();
		area = (lenght*width);
		grassCut = deck*mph;
		time = area/grassCut;
		totPay = time*RATE;
		System.out.println("It will take "+time+" hours to cut the grass \n and the person will be owed $"+totPay);
		input.close();
	}

}
