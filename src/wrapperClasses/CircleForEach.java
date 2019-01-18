package wrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;
import arrays.Circle;

public class CircleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Circle> shapes = new ArrayList<Circle>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a radii");
			shapes.add(new Circle(input.nextDouble()));
		}
		System.out.println("Area of the cirlces:");
		for (Circle temp : shapes) {
			System.out.println(temp.area());
			input.close();
		}
	}

}
