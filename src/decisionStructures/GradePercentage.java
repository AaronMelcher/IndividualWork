package decisionStructures;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean extraCred;
		System.out.println("Test score 1:");
		int score1 = input.nextInt();
		System.out.println("Test score 2:");
		int score2 = input.nextInt();
		System.out.println("Test score 3:");
		int score3 = input.nextInt();
		System.out.println("Did you do the extra credit (true or false)?");
		extraCred = input.nextBoolean();
		if (extraCred == true) {
			System.out.println("How many points did you earn for extra credit?");
			double points = input.nextDouble();
			double avgEC = ((score1+score2+score3)/3)+points;
			System.out.println("Average: "+avgEC);
		}
		if (extraCred == false) {
		double avg = ((score1+score2+score3)/3);
		System.out.println("Average: "+avg);
		
	}	
		input.close();
	}
}
