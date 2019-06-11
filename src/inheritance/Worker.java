package inheritance;

public class Worker extends Employee {
	private double experience;

	public Worker() {
		super();
		experience = 10;
	}

	public Worker(String n, double p, double e) {
		super(n, p);
		experience = e;
	}

	public double calculatePay(double h) {
		if (experience > 10) {
			return 1.2 * (super.getPay() * h);
		} else {
			return super.getPay() * h;
		}
	}

	public String toString() {
		return "Worker: Experience= " + experience + super.toString();
	}
}
