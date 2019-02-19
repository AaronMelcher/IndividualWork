package numberStuff;

import java.util.Random;

public class HowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int max = 10000;
		int min = 1;
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = min + bob.nextInt(max - min + 1);
		}
		int count = 0;
		for (int i = 0; i < 10000; i++) {
			for (int k : numbers) {
				if (i == k) {
					count++;
				}
			}
			System.out.println("The number, " + i + " is in the array, " + count + " time(s)");
			count = 0;
		}
	}
}
