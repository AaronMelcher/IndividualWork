package loops;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int j = 1;
		int i = 2;
		for (j = 1; j <= num; j++)
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
					num = num / i;
					if (i == 2) {
						i = 1;
					}
				}
			}
		System.out.print(i);
		input.close();
	}
}