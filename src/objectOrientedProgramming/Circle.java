package objectOrientedProgramming;

public class Circle {
	private double radius;
	public Circle() {
	}
	public Circle(double newR) {
		radius = newR;
	}
	public double getRadius() {
	return radius;
	}
	public double circumference() {
		double circumference = (radius*2)*Math.PI;
		return circumference;
	}
	public double area() {
		double area = Math.pow(radius, 2)*Math.PI;
		return area;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}