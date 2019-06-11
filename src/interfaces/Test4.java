package interfaces;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ShapeInterface> shapes = new ArrayList<ShapeInterface>();
		shapes.add(new Circle(8));
		shapes.add(new Rectangle(10, 10));
		shapes.add(new Circle(9));
		shapes.add(new Rectangle(5, 10));
		shapes.add(new Circle(10));
		double sum = 0;
		for (ShapeInterface temp : shapes) {
			sum += temp.area();
		}
		double small = shapes.get(0).perimeter();
		for (ShapeInterface temp : shapes) {
			if (temp.perimeter() < small) {
				small = temp.perimeter();
			}
		}
		System.out.println(sum);
		System.out.println(small);
	}

}
