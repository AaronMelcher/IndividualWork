package objectOrientedProgramming;

public class Car {
	private double mPG;
	private double tankCapacity;
	private double fuel;
	private double odometer;
	public Car() {
		mPG = 20;
		tankCapacity = 20;
		fuel = 20;
		odometer = 0;
	}
	public Car(double xMPG, double xCapacity, double xFuel, double xOdometer) {
		mPG = xMPG;
		tankCapacity = xCapacity;
		fuel = xFuel;
		odometer = xOdometer;
	}
	public void fill(double gallons) {
		fuel += gallons;
	}
	public void drive(double xMiles) {
		odometer += xMiles;
		fuel -= (xMiles/mPG);
	}
	public double getFuel() {
		return fuel;
	}
	public double getOdometer() {
		return odometer;
	}
}
