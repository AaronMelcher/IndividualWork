package randomNumbers;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;
		double largest = 0;
		double smallest = 999;
		double percent = 0;
		for (int j = 1; j <= 1000; j++) {
			for (int i = 1; i <= 100000; i++) {
				int ranNum = min + bob.nextInt(max - min + 1);
				if (ranNum == 1) {
					heads++;
				}
				if (ranNum == 2) {
					tails++;
				}
			}
			percent = (heads / 100000.0) * 100;
			if (percent > largest) {
				largest = percent;
			}
			if (percent < smallest) {
				smallest = percent;
			}
			heads = 0;
		}
		System.out.println("Largest: " + largest + "%");
		System.out.println("Smallest: " + smallest + "%");
	}
}