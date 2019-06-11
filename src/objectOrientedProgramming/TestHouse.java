package objectOrientedProgramming;

import java.util.Scanner;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House bob = new House();
		bob.paintWall();
		
		System.out.println("What is the number of rows in the garden?");
		int rows = input.nextInt();
		bob.plantGarden(rows);
		
		System.out.println("What is the radius of the pool?");
		double radius = input.nextDouble();
		System.out.println("What is the height of the pool?");
		double height = input.nextDouble();
		double volume = (radius*radius*Math.PI)*height;
		double gallons = volume*7.481;
		double hours = gallons/300;
		bob.fillPool(height, radius, hours);
		input.close();
	}

}
