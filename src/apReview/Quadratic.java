package apReview;

import java.util.*;

public class Quadratic {
	private ArrayList<Monomial> quad = new ArrayList<Monomial>();

	public Quadratic(ArrayList<Monomial> nums) {
		quad = nums;
	}

	public int getDeg() {
		return quad.get(0).getDeg();
	}

	public int getNumTerms() {
		return quad.size();
	}

	public String getName() {
		String temp;
		switch (quad.size()) {
		case 1:
			temp = "Monomial";
			break;
		case 2:
			temp = "Binomial";
			break;
		case 3:
			temp = "Trinomial";
			break;
		default:
			temp = "Polynomial";
			break;
		}
		return "Quadratic " + temp;
	}

	public boolean hasRoots(int a, int b, int c) {
		return Math.pow(b, 2) - (4 * a * c) >= 0;
	}

	public double[] getRoots(int a, int b, int c) {
		double r1 = 0;
		double r2 = 0;
		if (!this.hasRoots(a, b, c)) {
			return null;
		} else {
			r1 = (-b + (Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
			r2 = (-b - (Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
		}
		double[] roots = new double[2];
		roots[0] = r1;
		roots[1] = r2;
		return roots;
	}
}
