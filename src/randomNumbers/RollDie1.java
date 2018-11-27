package randomNumbers;

import java.util.Random;

public class RollDie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random(7);
		int min = 1;
		int max = 13;
		int multiple = 0;
		for (int i = 1; i <= 87; i++) {
			int ranNum = min + bob.nextInt(max - min + 1);
			if (ranNum%3 == 0) {
				multiple++;
			}
		}
		System.out.println(multiple);
	}

}
