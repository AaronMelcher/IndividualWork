package inheritance;

public class Manager extends Employee {
	private double lvl;

	public Manager() {
		super();
		lvl = 1;
	}

	public Manager(String n, double p, double l) {
		super(n, p);
		lvl = l;
	}

	public double calculatePay(double h) {
		return (1 + (lvl / 100)) * (super.getPay() * h);
	}

	public Manager clone() {
		return new Manager(super.getName(), super.getPay(), lvl);
	}
}
