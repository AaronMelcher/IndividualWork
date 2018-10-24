package objectOrientedProgramming;
	import java.util.Scanner;
public class House {
	public House() {
		
	}
	public void paintWall()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall (in feet)?");
		double length = input.nextDouble();
		System.out.println("What is the height of the wall (in feet)?");
		double height = input.nextDouble();
		double area = length*height;
		double hours = area/200;
		double minutes = hours*60;
		System.out.println("The total time to paint the wall is "+minutes+" minutes.");
		input.close();
	}
	public void plantGarden(int rows)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the garden (in feet)?");
		double length = input.nextDouble();
		double hours = (length/15)*2;
		System.out.println("The total time it will take is "+hours+" hours. \n And the number of rows is "+rows);
		input.close();
	}
	public void fillPool(double hours, double radius, double height)
	{
		System.out.println("It will take "+hours+" hours to fill the pool.");
		System.out.println("The radius is "+radius+" feet.");
		System.out.println("The height is "+height+" feet.");
	}
}
