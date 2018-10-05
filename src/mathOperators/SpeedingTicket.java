package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int base = 55;
		int mphOver = -999;
		final int add = 40;
		int total = -999;
		System.out.println("How many MPH did the person go over the speed limit?");
		mphOver = input.nextInt();
		total = add * (mphOver + -1) + base;
		System.out.println("The total is $" + total +"." );
		input.close();
		
	}

}
