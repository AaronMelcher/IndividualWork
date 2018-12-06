package randomNumbers;

import java.util.Random;

public class FixedSeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int min = 0;
		int max = 100;
		int randomNum = min + bob.nextInt(max - min + 1);
		System.out.println(randomNum);
	}

}
