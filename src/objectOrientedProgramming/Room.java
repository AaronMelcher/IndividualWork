package objectOrientedProgramming;

import java.util.Scanner;

public class Room {
	public Room()
	{
		
	}
	public void area()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("What is the length of the wall (feet)?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall (feet)?");
		int height = input.nextInt();
		int area = height*length;
		System.out.println("The area of the wall is "+area+" feet squared");
		input.close();
	}
	public void areaWithDoor()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("What is the length of the wall?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall?");
		int height = input.nextInt();
		System.out.println("What is the height of the door?");
		int doorHeight = input.nextInt();
		System.out.println("What is the width of the door?");
		int doorWidth = input.nextInt();
		int area = length*height;
		int doorArea = doorHeight*doorWidth;
		area = area - doorArea;
		System.out.println("The area of the wall without the door is "+area+" feet squared.");
		input.close();
	}
}
