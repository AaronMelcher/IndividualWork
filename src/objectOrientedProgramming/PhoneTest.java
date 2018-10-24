package objectOrientedProgramming;
import java.util.Scanner;
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone bob = new Phone();
		Scanner input = new Scanner(System.in);	
		System.out.println("Who was the call made to?");
		long xSent = input.nextLong();
		System.out.println("What was the length of the call?");
		double xLength = input.nextDouble();
		bob.makeCall(xSent, xLength);
		System.out.println("Number of calls: "+bob.getCalls());
		System.out.println("Length of calls: "+bob.getLength()+" minutes.");
		input.close();
	}
}
