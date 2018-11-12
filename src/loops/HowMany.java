package loops;

import java.util.Scanner;

public class HowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int count = 1;
		int sum = 0;
		do {
			sum += num;
			System.out.println("Enter a number:");
			num = input.nextInt();
			sum += num;
			count++;
		}
		while(sum < 2018);
		System.out.println("Numbers entered: "+count);
		input.close();
	}
}
