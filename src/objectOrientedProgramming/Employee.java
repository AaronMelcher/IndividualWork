package objectOrientedProgramming;

public class Employee {
	private double wage;
	private int years;
	public Employee() {
	 wage = 10.5;
	 years = 1;
}
	public double getWage() {
		return wage;
	}
	public void setWage(double newWage) {
		wage = newWage;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int totYears) {
		years = totYears;
	}
	public void raise() {
		wage = wage *1.1;
	}
}
