package strings;
import java.util.Scanner;
public class StringStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = new String(); // can't change the string
		String saying = "Hello World!"; // call to constructor
		String letter = "w"; // converts char to string -> doesn't work well
		Scanner input = new Scanner(System.in); // usually ask for input
		String userStuff = input.nextLine();
		input.close();
	}

}
