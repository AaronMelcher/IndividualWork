package objectOrientedProgramming;
import java.util.Scanner;
public class Shape {
	private double radius;
	private double base;
	private double height;
	private double base1;
	private double base2;
	private double heightT;
	private double leg;
	private double lengthR;
	private double width;
	public Shape() {
		
	}
	public void newRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius?");
		radius = input.nextDouble();
		}
		public double circumference() {
			double circumference = (radius*2)*Math.PI;
			return circumference;
		}
		public double areaC() {
			double area = Math.pow(radius, 2)*Math.PI;
			return area;
		}
		public void baseN() {
			Scanner input = new Scanner(System.in);
			System.out.println("What is the base of the right triangle?");
			base = input.nextDouble();
		}
		public void heightN() {
			Scanner input = new Scanner(System.in);
			System.out.println("What is the height of the right triangle?");
			height = input.nextDouble();
		}
		public double hypot() {
			double hypot = Math.hypot(base, height);
			return hypot;
		}
		public double perimeterRt() {
			double perimeter = base + height + Math.hypot(base, height);
			return perimeter;
		}
		public double areaRt() {
			double area = (base*height)/2;
			return area;
		}
		public void trapezoidP() {
			Scanner input = new Scanner(System.in);
			System.out.println("What is base 1 of the trapezoid?");
			base1 = input.nextDouble();
			System.out.println("What is base 2 of the trapezoid?");
			base2 = input.nextDouble();
			System.out.println("What is the height of the trapezoid?");
			heightT = input.nextDouble();
			System.out.println("What is the length of the leg of the trapezoid?");
			leg = input.nextDouble();
		}
		public double perimeterT() {
			return base1+base2+leg+leg;
		}
		public double areaT() {
			double avgB = (base1+base2)/2;
			double area = avgB*heightT;
			return area;
		}
		public void rectP() {
			Scanner input = new Scanner(System.in);
			System.out.println("What is the length of the rectangle?");
			lengthR = input.nextDouble();
			System.out.println("What is the width of the rectangle?");
		}
}