package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;

	public Parallelogram() {
		super();
		height = 5;
	}

	public Parallelogram(double b, double w, double h) {
		super(w, b, w, b);
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double area() {
		return super.getSide2() * height;
	}
}
