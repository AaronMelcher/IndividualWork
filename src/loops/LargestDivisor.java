package loops;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int divisors = 1;
		System.out.println("Enter a number:");
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num%i == 0 && i < num){
				divisors = i;
			}			
		}
		System.out.println("Largest divisor is "+divisors);
		input.close();
	}

}
