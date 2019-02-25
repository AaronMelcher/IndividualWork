package comparableInterface;

import java.util.Random;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatStart[] cats = new CatStart[100];
		Random bob = new Random();
		int max = 10;
		int min = 2;
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new CatStart(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1));
		}
		CatStart small = cats[0];
		CatStart large = cats[cats.length - 1];
		for (int i = 1; i < cats.length; i++) {
			if (small.compareTo(cats[i]) < 0) {
				small = cats[i];
			}
			if (large.compareTo(cats[i]) > 0) {
				large = cats[i];
			}
		}
		System.out.println(small.getAge() + " " + large.getAge());
	}

}
