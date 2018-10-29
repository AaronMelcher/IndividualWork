package decisionStructures;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Money recieved on 5th b-day:");
		double money = input.nextDouble();	
		if (Math.abs(money - Math.sqrt(84.3)) < 0.01) {
			System.out.println("You've won an amazing prize!");
		}
		else
		{
			System.out.println("You've won a horrible prize!");
		}
		input.close();
	}
	}

