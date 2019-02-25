package comparableInterface;

import java.util.ArrayList;
import java.util.Random;

public class CatTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CatStart> cats = new ArrayList<CatStart>();
		Random bob = new Random();
		int max = 10;
		int min = 2;
		for (int i = 0; i < 100; i++) {
			cats.add(new CatStart(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1)));
		}
		CatStart small = new CatStart(5, 6);
		CatStart large = cats.get(cats.size() - 1);
		for (CatStart temp : cats) {
			if (small.compareTo(temp) < 0) {
				small = temp;
			}
			if (large.compareTo(temp) > 0) {
				large = temp;
			}
		}
		System.out.println(small.getAge() + " " + large.getAge());
	}

}
