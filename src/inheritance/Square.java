package inheritance;

public class Square extends Rectangle implements Geo {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public String toString() {
		return "Square: " + super.toString();
	}
}
