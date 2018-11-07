package loops;

import java.util.Scanner;

public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a 4 digit integer (-1 to terminate):");
		num = input.nextInt();
		while (num != -1) {
			System.out.println("Number rounded to hundreds place: "+(num/100)*100);
			System.out.println("Enter another number (-1 to terminate):");
			num = input.nextInt();
		}
		input.close();
	}
	}

