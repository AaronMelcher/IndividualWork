package decisionStructures;
import java.util.Scanner;
public class HonorsActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What grade are you in (number)?");
		int grade = input.nextInt();
		System.out.println("GPA:");
		double gPA = input.nextDouble();	
		if (grade == 12 && gPA >= 3.5) {
			System.out.println("You are elilgible to graduate with honors.");
		}
		else
		{
			System.out.println("You aren't elilgible to graduate with honors.");
		}
		input.close();
	}
}
