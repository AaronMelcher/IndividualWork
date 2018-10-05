package mathOperators;

import java.util.Scanner;

public class PaintActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width;
		double length;
		int galCover = 150;
		double sa;
		int gallons;
		System.out.println("What is the width of the room (in feet)?");
		width = input.nextDouble();
		System.out.println("What is the lenght of the room (in feet)?");
		length = input.nextDouble();
		sa = 2*(8*width) + 2*(8*length);
		gallons = (int)Math.ceil(sa / galCover);
		System.out.println("You will need "+gallons+" gallons of paint.");
		input.close();
		
		
		
		
		
		
		
	}

}
