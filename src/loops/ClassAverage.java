package loops;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number of students:");
		int students = input.nextInt();
		double sum = 0;
		for (int j = 0; j < students; j++) {
			System.out.println("Test score:");
			double score = input.nextDouble();
			sum += score;
		}
		System.out.println("Average score:" + sum / students);
		input.close();
	}

}
