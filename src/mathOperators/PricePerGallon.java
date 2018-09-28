package mathOperators;

import java.util.Scanner;

public class PricePerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mpg = -999.99;
		double distance = -999.99;
		double moneySpent = -999.99;
		double gasAvg = -999.99;
		double totGallons = -999.99;
		System.out.println("What was the distance of your trip?");
		distance = input.nextDouble();
		System.out.println("What is the fuel economy (MPG) of your car?");
		mpg = input.nextDouble();
		System.out.println("How much money did you spend on gas?");
		moneySpent =  input.nextDouble();
		totGallons = distance/mpg;
		gasAvg = moneySpent/totGallons;
		System.out.println("The average cost of gas per gallon on your trip was $" + gasAvg);
		
		input.close();
	}

}
