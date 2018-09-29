package mathOperators;

import java.util.Scanner;

public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double POSTAREA = 9.0;
		double length = -999.99;
		double width = -999.99;
		double area = -999.99;
		double totPost = -999.99;
		System.out.println("What is the lenght of the rectangular area?");
		length = input.nextDouble();
		System.out.println("What is the width of the rectangular area?");
		width = input.nextDouble();
		area = length * width;
		totPost = area/POSTAREA;
		System.out.println("You will need "+ totPost +" post-its to cover the area.");
		input.close();
	}

}
