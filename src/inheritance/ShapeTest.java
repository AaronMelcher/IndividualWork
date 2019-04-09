package inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral bob = new Quadrilateral(5, 5, 5, 5);
		System.out.println(bob.perimeter());
		bob.setSide1(6);
		System.out.println(bob.perimeter());
		Rectangle fred = new Rectangle(6, 12);
		System.out.println(fred.area() + " " + fred.perimeter() + " " + fred.getSide1());
		Trapezoid todd = new Trapezoid(2, 3, 4, 6, 4);
		System.out.println(todd.area());
		Parallelogram rob = new Parallelogram(4, 5, 6);
		System.out.println(rob.area());
	}

}
