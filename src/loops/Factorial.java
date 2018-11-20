package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter a number:");
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
		input.close();
	}

}
