package loops;

public class RightTrianlgeClass {
	private double base;
	private double height;
		public RightTrianlgeClass() {
			
		}
		public RightTrianlgeClass(double newB, double newH) {
			base = newB;
			height = newH;
		}
		public void changeBase(double newB) {
			base = newB;
		}
		public void changeHeight(double newH) {
			height = newH;
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
