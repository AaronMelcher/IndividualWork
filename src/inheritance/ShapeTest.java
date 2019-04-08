package inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral bob = new Quadrilateral(5, 5, 5, 5);
		System.out.println(bob.perimeter());
		bob.setSide1(6);
		System.out.println(bob.perimeter());
	}

}
