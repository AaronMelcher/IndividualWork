package wrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> score = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many students?");
		int stu = input.nextInt();
		for (int i = 0; i < stu; i++) {
			System.out.println("Enter score:");
			score.add(input.nextDouble());
		}
		double high = 0;
		double low = 999;
		for (double temp : score) {
			if (temp > high) {
				high = temp;
			}
			if (temp < low) {
				low = temp;
			}
		}
		score.set(0, low);
		score.set(score.size() - 1, high);
		for (double temp : score) {
			System.out.println(temp);
		}
		input.close();
	}

}
