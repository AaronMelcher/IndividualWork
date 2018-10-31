package decisionStructures;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Test Average:");
		double avg = input.nextDouble();
		if (avg >= 92.5) {
			System.out.println("Letter grade: A");
		} else {
			if (avg >= 84.5) {
				System.out.println("Letter grade: B");
			} else {
				if (avg >= 77.5) {
					System.out.println("Letter grade: C");
				} else {
					if (avg >= 69.5) {
						System.out.println("Letter grade: D");
					} else {
						System.out.println("Letter grade: F");
					}
				}
			}
		}
		input.close();
	}
}
