package loops;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int sum = 0;
		for(int j = 1; j <= num; j++) {
			if(j%2 == 1) {
				sum += j;
			}
		}
		System.out.println("Sum of odd intergers: "+sum);
		input.close();
	}

}
