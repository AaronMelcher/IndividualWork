package loops;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int divisors = 0;
		System.out.println("Enter a number:");
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num%i == 0){
			divisors++;
			}
		}
		System.out.println("Number of divisors is "+divisors);
		input.close();
	}

}
