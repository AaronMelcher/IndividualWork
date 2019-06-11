package objectOrientedProgramming;
import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RightTriangle bob = new RightTriangle();
		Circle fred = new Circle();
		Rectangle kyle = new Rectangle();
		IsosTrapezoid todd = new IsosTrapezoid();
		
		System.out.println("What is the radius of the circle?");
		fred.setRadius(input.nextDouble());
		System.out.println(fred.getRadius());
		System.out.println(fred.circumference());
		System.out.println(fred.area());
		
		System.out.println("What is the height of the right triangle?");
		bob.changeHeight(input.nextDouble());
		System.out.println("How long is the base of the right triangle?");
		bob.changeBase(input.nextDouble());
		System.out.println(bob.area());
		System.out.println(bob.hypot());
		System.out.println(bob.perimeter());
		
		System.out.println("What is the length of the rectangle?");
		kyle.changeLength(input.nextDouble());
		System.out.println("What is width of the rectangle?");
		kyle.changeWidth(input.nextDouble());
		System.out.println(kyle.area());
		System.out.println(kyle.perimeter());
		
		System.out.println("How long is base 1 of the trapezoid?");
		todd.baseN(input.nextDouble());
		System.out.println("How long is base 2 of the trapezoid?");
		todd.base2N(input.nextDouble());
		System.out.println("What is the height of the trapezoid?");
		todd.heightN(input.nextDouble());
		System.out.println("What is the length of one leg of the trapezoid?");
		todd.legN(input.nextDouble());
		System.out.println(todd.area());
		System.out.println(todd.perimeter());
		input.close();
	}

}
