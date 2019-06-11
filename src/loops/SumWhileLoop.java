package loops;

import java.util.Scanner;

public class SumWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.println("Number:");
		int num = input.nextInt();
		while (count <= num) {
			sum += count;
			count += 2;
		}
		System.out.println(sum);
		input.close();
	}

}
