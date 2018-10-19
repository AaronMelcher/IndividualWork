package objectOrientedProgramming;
import java.util.Scanner;
public class Shape {
	private double radius;
	private double base;
	private double height;
	public Shape() {
		
	}
	public double getRadius() {
		return radius;
		}
		public double circumference() {
			double circumference = (radius*2)*Math.PI;
			return circumference;
		}
		public double areaC() {
			double area = Math.pow(radius, 2)*Math.PI;
			return area;
		}
		public void setRadius(double newRadius) {
			radius = newRadius;
		}
		public double hypot() {
			double hypot = Math.hypot(base, height);
			return hypot;
		}
		public double perimeter() {
			double perimeter = base + height + Math.hypot(base, height);
			return perimeter;
		}
		public double area() {
			double area = (base*height)/2;
			return area;
}
}