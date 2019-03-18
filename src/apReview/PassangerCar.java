package apReview;

public class PassangerCar {
	private double base;
	private int maxPass;
	
	public PassangerCar(double weight, int people) {
			base = weight;
			maxPass = people;
	}
	
	public double weight() {
		return base + (maxPass * 300);
	}
}
