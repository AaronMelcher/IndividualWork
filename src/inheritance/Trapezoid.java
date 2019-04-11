package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;

	public Trapezoid() {
		super();
		height = 5;
	}

	public Trapezoid(double right, double top, double left, double bottom, double h) {
		super(right, top, left, bottom);
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double area() {
		return ((super.getSide2() + super.getSide4()) / 2) * height;
	}
}