package loops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("Enter a number:");
			int num = input.nextInt();
			sum += num;
			if(num % 2 == 0) {
				System.out.println("Number "+num+" is even");
			}
			else {
				System.out.println("Number "+num+" is odd");
			}
		}
		System.out.println("Sum"+sum);
		input.close();
	}

}
