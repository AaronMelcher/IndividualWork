package arrays;

import java.util.ArrayList;
import java.util.Random;

public class RectangleProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
		Random bob = new Random();
		int max = 50;
		int min = 1;
		for (int i = 0; i < 20; i++) {
			shapes.add(new Rectangle(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1)));
		}
		double areaH = 0;
		double areaS = 10000;
		Rectangle temp1 = new Rectangle();
		Rectangle temp2 = new Rectangle();
		for (int j = 0; j < shapes.size(); j++) {
			if (shapes.get(j).area() > areaH) {
				areaH = shapes.get(j).area();
				temp1 = shapes.get(j);
			}
			if (shapes.get(j).area() < areaS) {
				areaS = shapes.get(j).area();
				temp2 = shapes.get(j);
			}
		}
		shapes.set(0, temp1);
		shapes.set(19, temp2);
		for(int k = 0; k < shapes.size(); k++) {
			System.out.println(shapes.get(k).area());
		}
	}

}
