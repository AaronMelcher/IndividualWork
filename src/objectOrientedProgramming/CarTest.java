package objectOrientedProgramming;
import java.util.Scanner;
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Car kids = new Car();
		Car dad = new Car();
		Car mom = new Car();
		System.out.println("How far did the dad drive?");
		dad.drive(input.nextDouble());
		System.out.println("How much gas did the mom fill up?");
		mom.fill(input.nextInt());
		System.out.println("How far did the kid drive?");
		kids.drive(input.nextDouble());
		System.out.println("How much gas did the dad fill up?");
		dad.fill(input.nextInt());
		System.out.println(kids.getFuel());
		System.out.println(kids.getOdometer());
		System.out.println(dad.getFuel());
		System.out.println(dad.getOdometer());
		System.out.println(mom.getFuel());
		System.out.println(mom.getOdometer());
		input.close();
	}

}
