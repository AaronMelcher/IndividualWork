package decisionStructures;
import java.util.Scanner;
public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double numPost;
		System.out.println("Choose an option: \n1. Feet \n2. Inches");
		int choice = input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter length of the rectangle in FEET:");
			length = input.nextDouble();
			length *= 12;
			System.out.println("Enter the width of the rectangle in FEET:");
			width = input.nextDouble();
			width *= 12;
		break;
		case 2:
			System.out.println("Enter the length of the rectangle in INCHES:");
			length = input.nextDouble();
			System.out.println("Enter the width of the rectangle in INCHES:");
			width = input.nextDouble();
			break;
			default:
				System.out.println("Please choose a menu option correctly...");
				length = 9;
				width = 9;
		}
		numPost = (length*width)/9;
		System.out.println("You will need "+ numPost +" post-its.");
		input.close();
	}

}
