package objectOrientedProgramming;

public class Worker {
	private int hours;
	private double wage;
	public Worker() {
	}
	public int getHours() {
		return hours;
	}
	public double getWage() {
		return wage;
	}
	public void totHours(int hoursWorked) {
		hours = hoursWorked;
	}
	public void setWage(double xWage) {
		wage = xWage;
	}
	public double payCheck() {
	double check = hours*wage;
	return check;
	}
	public void raise(double xRaise) {
		wage = wage+xRaise;
	}
}