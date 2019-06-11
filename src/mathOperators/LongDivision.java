package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dividend = -999;
		int divisor = -999;
		int answer1 = -999;
		int answer2 = -999;
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		answer1 = dividend / divisor;
		answer2 = dividend % divisor;
		System.out.println("Your answer is "+ answer1 + "r" +answer2);
		input.close();
		
				
	}

}
