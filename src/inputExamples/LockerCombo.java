package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = -999;
		int second = -999;
		int third = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number in your locker combonation?");
		first = input.nextInt();
		System.out.println("What is the second number?");
		second = input.nextInt();
		System.out.println("What is the thrid number?");
		third = input.nextInt();
		System.out.println("Your combo is "+ first + "-"+ second +"-"+ third);
		input.close();
	}

}
