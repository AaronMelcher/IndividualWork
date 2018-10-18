package objectOrientedProgramming;

public class IsosTrapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;
		public IsosTrapezoid() {
			
		}
		public IsosTrapezoid(double newB1, double newB2, double newH, double newL) {
			base1 = newB1;
			base2 = newB2;
			height = newH;
			leg = newL;
		}
		public double perimeter() {
			return base1+base2+leg+leg;
		}
		public double area() {
			double avgB = (base1+base2)/2;
			double area = avgB*height;
			return area;
		}
}
