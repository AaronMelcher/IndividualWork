package decisionStructures;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Test average:");
		double tAVG = input.nextDouble();
		System.out.println("Homework average:");
		double hAVG = input.nextDouble();
		System.out.println("Is your teacher nice (true of false)?");
		boolean nice = input.nextBoolean();
		if (nice == true) {
			if (tAVG > hAVG) {
				System.out.println("Grade:" + tAVG);
			} else {
				System.out.println("Grade:" + hAVG);
			}
		} else {
			if (tAVG < hAVG) {
				System.out.println("Grade:" + tAVG);
			} else {
				System.out.println("Grade:" + hAVG);
			}
		}
		input.close();
	}
}
