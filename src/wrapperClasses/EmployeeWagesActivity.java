package wrapperClasses;

import java.util.Scanner;

public class EmployeeWagesActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number of employees:");
		double[] wage = new double[input.nextInt()];
		for (int i = 0; i < wage.length; i++) {
			System.out.println("Enter wage:");
			wage[i] = input.nextDouble();
		}
		double high = 0;
		for (double temp : wage) {
			if (temp > high) 
				high = temp;
		}
		System.out.println("Highest wage: " + high);
		input.close();
	}
}
