package decisionStructures;

import java.util.Scanner;

public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height;
		double shoeSize;
		System.out.println("What is your height(in)?");
		height = input.nextDouble();
		System.out.println("What is your shoe size?");
		shoeSize = input.nextDouble();
		System.out.println(height < 62 && shoeSize > 9);
		input.close();
	}

}
