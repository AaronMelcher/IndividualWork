package objectOrientedProgramming;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle();	
		bob.changeLength(6);
		bob.changeWidth(7);
		System.out.println(bob.getLength());
		System.out.println(bob.getWidth());
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
	}
}
