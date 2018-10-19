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
		
		
	}

}
