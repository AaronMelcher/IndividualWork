package loops;
import java.util.Scanner;
public class CountinueAskingAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value (0 for quit)");
		double num = input.nextDouble();
		double sum = 0;
		int count = 0;
		while(num != 0.0) {
			sum += num;
			count++;
			System.out.println("Enter a value (0 for quit)");
			num = input.nextDouble();
		}
		double avg = sum/count;
		System.out.println("Your average is: "+avg);
		input.close();
	}

}
