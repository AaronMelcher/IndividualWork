package loops;

import java.util.Scanner;

public class DoWhileRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int numH = num;
		int numL = num;
		do {
			if(num > numH) {
				numH = num;
			}
			if(num < numL) {
				numL = num;
			}
			System.out.println("Enter a number (9999 to quit):");
			num = input.nextInt();
		} while (num != 9999);
		{

		}
		System.out.println("Range: "+ (numH-numL));
		input.close();
	}

}
