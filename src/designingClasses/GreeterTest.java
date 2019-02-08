package designingClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Greeter> people = new ArrayList<Greeter>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many greeters?");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			people.add(new Greeter());
		}
		for (Greeter temp : people) {
			System.out.println(temp.displayInfo());
		}
		input.close();
	}

}
