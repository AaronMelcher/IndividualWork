package loops;
import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RightTrianlgeClass bob = new RightTrianlgeClass();
		RightTrianlgeClass fred = new RightTrianlgeClass();
		RightTrianlgeClass bobby = new RightTrianlgeClass();
		boolean con = true;
		double largeA = 0;
		do {
			System.out.println("Input the base:");
			bob.changeBase(input.nextDouble());
			System.out.println("Input the height:");
			bob.changeHeight(input.nextDouble());
			System.out.println("Input the base:");
			fred.changeBase(input.nextDouble());
			System.out.println("Input the height:");
			fred.changeHeight(input.nextDouble());
			System.out.println("Input the base:");
			bobby.changeBase(input.nextDouble());
			System.out.println("Input the height:");
			bobby.changeHeight(input.nextDouble());
			if(bob.area() > fred.area() && bob.area() > bobby.area()) {
				largeA = bob.area();
			}
			if(fred.area() > bob.area() && fred.area() > bobby.area()) {
				largeA = fred.area();
			}
			if(bobby.area() > bob.area() && bobby.area() > fred.area() ) {
				largeA = bobby.area();
			}
			System.out.println("Largest area: "+largeA);
			System.out.println("Do you wish to continue (true or false)?");
			con = input.nextBoolean();
			}
		while(con == true);
		input.close();
	}
}
