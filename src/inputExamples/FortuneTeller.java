package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = -999;
		int lucky = -999;
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight:");
		weight = input.nextInt();
		System.out.println("Enter your age:");
		age = input.nextInt();
		System.out.println("Enter your lucky number:");
		lucky = input.nextInt();
		System.out.println("I see... \n In the future...");
		System.out.println("In "+ lucky +" years from now...");
		System.out.println("You'll be in room "+ age + weight + " in the old folks home.");
		input.close();
		
	}

}
