package mathOperators;

import java.util.Scanner;

public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = -999;
		int test2 = -999;
		int test3 = -999;
		int total = -999;
		System.out.println("What is the score of Test 1?");
		test1 = input.nextInt();
		System.out.println("What is the score of Test 2");
		test2 = input.nextInt();
		System.out.println("What is the score of Test 3");
		test3 = input.nextInt();
		total = (test1 + test2 + test3)/3;
		System.out.println("The average score is " + total);
		input.close();
		
	}

}
