package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = -999;
		int second = -999;
		int third = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Type in a one digit number:");
		first = input.nextByte();
		System.out.println("Type in another one digit number:");
		second = input.nextByte();
		System.out.println("Type in a final one digit number:");
		third = input.nextByte();
		System.out.println("Your password options are:\n "+ first +""+ second+ ""+ third +"");
		input.close();
	}

}
