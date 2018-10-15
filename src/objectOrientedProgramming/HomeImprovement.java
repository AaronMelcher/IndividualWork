package objectOrientedProgramming;
	import java.util.Scanner;
public class HomeImprovement {
	public HomeImprovement()
	{
		
	}
	public void fill1()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the length(feet):");
	double length = input.nextDouble();
	System.out.println("Enter the width(feet):");
	double width = input.nextDouble();
	System.out.println("Enter the depth(feet):");
	double depth = input.nextDouble();
	double volume = length*width*depth;
	System.out.println("Ammount of sand (cubic feet) trasnported in an hour:");
	double sand = input.nextDouble();
	double hours = volume/sand;
	System.out.println("It will take "+hours+" hours to fill the sandbox");
	input.close();
	}
}