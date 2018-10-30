package decisionStructures;

import java.util.Scanner;

public class SalaryActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Yearly Wage:");
		double salary = input.nextDouble();
		if (salary <= 20000) {
			System.out.println("You must be a worker.");
		} else {
			if (salary >= 20000 && salary <= 40000) {
				System.out.println("You must be a manager.");
			} else {
				if (salary >= 40000 && salary <= 100000) {
					System.out.println("You must be a CEO.");
				} else {
					System.out.println("You must be the owner");
				}

			}
		}
		input.close();
	}
}
