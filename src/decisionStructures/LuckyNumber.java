package decisionStructures;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Age:");
		int age = input.nextInt();	
		if (age >= 18) {
			System.out.println("Height (in):");
			double height = input.nextInt();
			System.out.println("Lucky number:"+height*5);
		}
		else
		{
			System.out.println("Weight (lbs):");
			double weight = input.nextDouble();
			System.out.println("Lucky number:"+weight/2);
		}
		input.close();
	}

}
