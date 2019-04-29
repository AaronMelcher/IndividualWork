package apReview;

public class Monomial {
	private double coeff;
	private int deg;
	
	public Monomial(double c, int d) {
		coeff = c;
		deg = d;
	}
	
	public int getDeg() {
		return deg;
	}
	
	public double getCoeff() {
		return coeff;
	}
}
