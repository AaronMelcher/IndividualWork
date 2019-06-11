package apReview;

import java.util.*;

public class PolynomialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Monomial> in = new ArrayList<Monomial>();
		in.add(new Monomial(2, 2));
		in.add(new Monomial(-7, 1));
		in.add(new Monomial(5, 0));
		Quadratic fred = new Quadratic(in);
		System.out.println(fred.getName());
		double[] cool = fred.getRoots();
		System.out.println(cool[0] + " " + cool[1]);
	}

}
