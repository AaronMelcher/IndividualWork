package inheritance;

public class Rectangle extends Parallelogram implements Geo {

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double w) {
		super(w, l, w);
	}

	public String toString() {
		return "Rectangle: " + super.toString();
	}
}
