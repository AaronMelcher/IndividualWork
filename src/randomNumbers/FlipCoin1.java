package randomNumbers;

import java.util.Random;

public class FlipCoin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random(3);
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;
		for (int i = 1; i <= 100000; i++) {
			int ranNum = min + bob.nextInt(max - min + 1);
			if (ranNum == 1) {
				heads++;
			}
			if (ranNum == 2) {
				tails++;
			}
		}
		System.out.println(heads + "  " + tails);
	}
}
