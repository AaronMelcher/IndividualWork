package apReview;

import java.util.Random;

public class Employee {
	private String name;
	private double rate;
	private double[] hours = new double[52];
	private static int employeeNum = 1;
	private int myNum;

	public Employee() {
		Random bob = new Random();
		int min = 0;
		int max = 40;
		name = "John Smith";
		rate = 10;
		for (int i = 0; i < hours.length; i++) {
			hours[i] = min + bob.nextInt(max - min + 1);
		}
		myNum = employeeNum;
		employeeNum++;
	}

	public void modRate(double add) {
		if (rate - add < 0) {
			System.out.println("Enter a better value");
		} else {
			rate += add;
		}
	}

	public double calcPay(int week) {
		if (week >= 0 && week < 52) {
			return hours[week] * rate;
		} else {
			return 0.0;
		}
	}

	public String getNum() {
		return "Employee Num: " + employeeNum + " My Num: " + myNum;
	}

	public String getName() {
		return name;
	}

	public int getMyNum() {
		return myNum;
	}
}
