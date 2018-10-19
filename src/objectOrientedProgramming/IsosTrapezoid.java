package objectOrientedProgramming;

public class IsosTrapezoid {
	private double base1;
	private double base2;
	private double heightT;
	private double leg;
		public IsosTrapezoid() {
			
		}
		public IsosTrapezoid(double newB1, double newB2, double newH, double newL) {
			base1 = newB1;
			base2 = newB2;
			heightT = newH;
			leg = newL;
		}
		public double perimeter() {
			return base1+base2+leg+leg;
		}
		public double area() {
			double avgB = (base1+base2)/2;
			double area = avgB*heightT;
			return area;
		}
		public void baseN(double newB) {
			base1 = newB;
		}
		public void base2N(double newB) {
			base2 = newB;
		}
		public void heightN(double newH) {
			heightT = newH;
}
		public void legN(double newL) {
			leg = newL;
}
}
