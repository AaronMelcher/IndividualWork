package loops;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many items?");
		int items = input.nextInt();
		double sum = 0.0;
		for (int j = 0; j < items; j++) {
			System.out.println("Enter the cost of an item:");
			double cost = input.nextDouble();
			sum += cost;
		}
		System.out.println("Total cost: $" + sum);
		System.out.println("Tax: $" + (sum * 0.05));
		System.out.println("Total with tax: $" + (sum * 1.05));
		input.close();
	}

}
