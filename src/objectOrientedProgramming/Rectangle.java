package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle() {
		length = -99.99;
		width = -999.99;
}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void changeLength(double newLength) {
	length = newLength;
	}
	public void changeWidth(double newWidth) {
		width = newWidth;
	}
	public double area() {
	double area = length*width;
	return area;
	}
	public double perimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}
	}