package mathOperators;
import java.util.Scanner;
public class VoteEligibilityActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("How old are you?");
		age = input.nextInt();
		age = 18 - age;
		System.out.println("You will be able to vote in "+ age +" years.");
		input.close();
	}

}
