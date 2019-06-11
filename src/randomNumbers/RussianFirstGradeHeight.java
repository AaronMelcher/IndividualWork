package randomNumbers;

import java.util.Random;

public class RussianFirstGradeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random(0);
		int min = 26;
		int max = 43;
		int multiple = 0;
		for (int i = 1; i <= 248; i++) {
			int ranNum = min + bob.nextInt(max - min + 1);
			if (ranNum > 36) {
				multiple++;
			}
		}
		System.out.println(multiple);
	}

}
