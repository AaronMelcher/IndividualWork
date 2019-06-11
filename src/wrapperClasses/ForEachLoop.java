package wrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> age = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Number of students:");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter age:");
			age.add(input.nextInt());
		}
		double avg = 0;
		for (int temp : age) {
			avg += temp;
		}
		System.out.println("Average age: " + avg / age.size());
		input.close();
	}
}