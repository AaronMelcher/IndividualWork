package interfaces;

import java.util.Scanner;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a length:");
		double l = input.nextDouble();
		System.out.println("Enter a width:");
		double w = input.nextDouble();
		Rectangle thing = new Rectangle(l, w);
		ShapeInterface bob = thing;
		System.out.println(thing.area() + " " + thing.perimeter());
		System.out.println(bob.area() + " " + bob.perimeter());
		input.close();
	}

}
