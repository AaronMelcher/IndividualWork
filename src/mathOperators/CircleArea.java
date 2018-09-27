package mathOperators;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.0;
		final double PI = 3.14;
		double area = -999;
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		area = Math.PI * (radius * radius);
		System.out.println("The area is "+ area);
		input.close();
		
	}

}
