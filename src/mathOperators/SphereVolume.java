package mathOperators;
import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.99;
		double volume = -999.99;
		double number = (4.0/3.0);
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		volume = number * (radius * radius * radius) * Math.PI ;
		System.out.println("The volume of the sphere is " + volume + " inches cubed.");
		input.close();
		
		
	}

}
