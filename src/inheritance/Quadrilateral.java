package inheritance;

public class Quadrilateral {
	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrilateral() {
		side1 = 5;
		side2 = 6;
		side3 = 7;
		side4 = 8;
	}

	public Quadrilateral(double s1, double s2, double s3, double s4) {
		if (s1 > 0)
			side1 = s1;
		else
			side1 = 6;
		if (s2 > 0)
			side2 = s2;
		else
			side2 = 6;
		if (s3 > 0)
			side3 = s3;
		else
			side3 = 6;
		if (s4 > 0)
			side4 = s4;
		else
			side4 = 6;
	}

	public void setSide1(double s) {
		if (s > 0)
			side1 = s;
		else
			side1 = 6;
	}

	public void setSide2(double s) {
		if (s > 0)
			side2 = s;
		else
			side2 = 6;
	}

	public void setSide3(double s) {
		if (s > 0)
			side3 = s;
		else
			side3 = 6;
	}

	public void setSide4(double s) {
		if (s > 0)
			side4 = s;
		else
			side4 = 6;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getSide4() {
		return side4;
	}

	public double perimeter() {
		return side1 + side2 + side3 + side4;
	}
}
