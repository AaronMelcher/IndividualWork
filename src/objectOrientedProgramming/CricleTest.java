package objectOrientedProgramming;

public class CricleTest {

	public static void main(String[] args) {
		Circle bob = new Circle();
		bob.setRadius(9.5);
		System.out.println(bob.getRadius());
		System.out.println(bob.area());
		System.out.println(bob.circumference());
	}

}
