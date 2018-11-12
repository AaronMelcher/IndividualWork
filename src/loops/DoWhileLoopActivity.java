package loops;

import java.util.Scanner;

public class DoWhileLoopActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		do {
			System.out.println("Magic number: "+num*17);
			System.out.println("Enter a number (9999 to quit):");
			num = input.nextInt();
		} while (num != 9999);
		{

		}
		input.close();
	}
}