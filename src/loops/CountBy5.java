package loops;

import java.util.Scanner;

public class CountBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Number:");
		int num = input.nextInt();
		while (count <= num) {
			System.out.println(count);
			count += 5;
		}
		input.close();
	}

}
