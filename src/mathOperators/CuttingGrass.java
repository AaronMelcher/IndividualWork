package mathOperators;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius;
		double areaF;
		double width;
		double lenght;
        int pay;
		double area;
		System.out.println("What is the legnth of the lawn?");
		lenght = input.nextDouble();
		System.out.println("What is the width of the lawn?");
		width = input.nextDouble();
		area = lenght * width;
		System.out.println("What is the radius of the fountain?");
		radius = input.nextDouble();
		areaF = Math.PI * (radius * radius);
		area = area-areaF;
		pay = (int)Math.ceil((area/100)*1.25);
		System.out.println("You need to pay $"+ pay +" to the person cutting your grass.");
		input.close();
	}

}
