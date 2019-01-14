package arrays;

public class Circle {
	private double radius;

	public Circle() {
		radius = -99;
	}

	public Circle(double xRadius) {
		if (xRadius > 0) {
			radius = xRadius;
		} else {
			radius = 5;
		}

	}

	public double getRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public void setRadius(double xRadius) {
		if (xRadius > 0) {
			radius = xRadius;
		} else {
			radius = 5;
		}
	}
}
