package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Number of rolls:");
		int rolls = input.nextInt();
		int min = 1;
		int max = 6;
		int ranNum = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		for (int i = 1; i <= rolls; i++) {
			ranNum = min + bob.nextInt(max - min + 1);
			if(ranNum == 1) {
				ones++;
			}
			if(ranNum == 2) {
				twos++;
			}
			if(ranNum == 3) {
				threes++;
			}
			if(ranNum == 4) {
				fours++;
			}
			if(ranNum == 5) {
				fives++;
			}
			if(ranNum == 6) {
				sixes++;
			}
		}
		System.out.print(ones + " ");
		System.out.print(twos + " ");
		System.out.print(threes + " ");
		System.out.print(fours + " ");
		System.out.print(fives + " ");
		System.out.print(sixes + " ");
		System.out.println(" ");
		System.out.println(ones*100 / rolls);
		System.out.println(twos*100 / rolls);
		System.out.println(threes*100 / rolls);
		System.out.println(fours*100 / rolls);
		System.out.println(fives*100 / rolls);
		System.out.println(sixes*100 / rolls);
		input.close();
	}

}
