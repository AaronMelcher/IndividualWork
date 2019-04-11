package inheritance;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Geo> fred = new ArrayList<Geo>();
		fred.add(new Rectangle(4, 7));
		fred.add(new Trapezoid(3, 8, 5, 1, 9));
		fred.add(new Rectangle(9, 2));
		fred.add(new Trapezoid(4, 5, 2, 9, 8));
		fred.add(new Rectangle(5, 1));
		fred.add(new Trapezoid(4, 2, 6, 8, 10));

		double largest = 0;
		for (Geo shape : fred) {
			if (shape.area() > largest) {
				largest = shape.area();
			}
		}

		System.out.println("Class= " );
		System.out.println("Largest= " + largest);
	}

//Still need to show which class has the largest object in it
//Could remember it through the for loop
}
