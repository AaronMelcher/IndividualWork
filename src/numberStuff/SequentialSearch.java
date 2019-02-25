package numberStuff;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		int[] ran = new int[100];
		int max = 100;
		int min = 0;
		for(int i = 0; i < 100; i++) {
			ran[i] = min + bob.nextInt(max - min + 1);
		}
		int count = 0;
		System.out.println("Enter a number 0-499");
		int num = input.nextInt();
		for(int k : ran) {
			if(k == num) {
				count++;
			}
		}
		System.out.println("Number of times your number appeared: "+count);
		input.close();
	}

}
