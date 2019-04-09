package inheritance;

public class Rectangle extends Quadrilateral {

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double w) {
		super(w, l, w, l);
	}

	public double area() {
		return super.getSide1() * super.getSide2();
	}
}
