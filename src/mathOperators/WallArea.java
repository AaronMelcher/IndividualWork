package mathOperators;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height = 8.0;
		double width = -999.0;
		double area = -999.0;
		System.out.println("How wide is a wall that is 8 feet tall?");
		width = input.nextDouble();
		area = height * width;
		System.out.println("The wall has an area of " + area + " feet.");
		input.close();

	}

}
