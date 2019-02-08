package designingClasses;

public class Car {
	private double mPG;
	private double tankCap;
	private double fuel;
	private double odometer;

	public Car() {
		mPG = 20;
		tankCap = 20;
		fuel = 20;
		odometer = 0;
	}

	public Car(double xMPG, double xCapacity, double xFuel, double xOdometer) {
		if (xMPG > 0) {
			mPG = xMPG;
		} else {
			mPG = 20;
		}
		if (xCapacity > 0) {
			tankCap = xCapacity;
		} else {
			tankCap = 20;
		}
		if (xFuel <= xCapacity) {
			fuel = xFuel;
		} else {
			fuel = xCapacity;
		}
		if (xOdometer > 0) {
			odometer = xOdometer;
		} else {
			odometer = 20;
		}
	}

	public void fill(double gallons) {
		if((gallons + fuel) <= tankCap) {
		fuel += gallons;
		}else {
			
		}
	}

	public void drive(double xMiles) {
		odometer += xMiles;
		fuel -= (xMiles / mPG);
	}

	public double getFuel() {
		return fuel;
	}

	public double getOdometer() {
		return odometer;
	}
}
