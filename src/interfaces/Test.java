package interfaces;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a length:");
		double length = input.nextDouble();
		System.out.println("Enter a width:");
		double width = input.nextDouble();
		ShapeInterface bob = new Rectangle(length, width);
		System.out.println("Area: " + bob.area() + " Perimeter: " + bob.perimeter());
		input.close();
	}

}
