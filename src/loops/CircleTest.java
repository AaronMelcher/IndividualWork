package loops;
import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle bob = new Circle();
		Circle fred = new Circle();
		Circle bobby = new Circle();
		Scanner input = new Scanner(System.in);
		boolean con = true;
		double largeC = 0;
		do {
			System.out.println("Input a radius:");
			bob.setRadius(input.nextDouble());
			System.out.println("Input a radius:");
			fred.setRadius(input.nextDouble());
			System.out.println("Input a radius:");
			bobby.setRadius(input.nextDouble());
			if(bob.circumference() > fred.circumference() && bob.circumference() > bobby.circumference()) {
				largeC = bob.circumference();
			}
			if(fred.circumference() > bob.circumference() && fred.circumference() > bobby.circumference()){
				largeC = fred.circumference();
			}
			if(bobby.circumference() > bob.circumference() && bobby.circumference() > fred.circumference()) {
				largeC = bobby.circumference();
			}
			System.out.println("Largest circumference: "+largeC);
			System.out.println("Do you wish to continue (true or false)?");
			con = input.nextBoolean();
		}
		while(con == true); {
			
		}
		input.close();
	}

}
