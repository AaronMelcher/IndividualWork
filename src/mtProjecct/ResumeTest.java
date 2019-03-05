package mtProjecct;

import java.io.*;
import java.util.*;

public class ResumeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<ResumeClass> searching = new ArrayList<ResumeClass>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to search for?");
		int num = input.nextInt();
		input.next();
		int i = 0;
		while (i < num) {
			System.out.println("Enter your word:");
			String bob = input.nextLine();
			searching.add(new ResumeClass(bob));
			i++;
		}
		for (ResumeClass temp : searching) {
			System.out.println(temp.getNum() + " appears " + temp.getNum() + " times");
		}
		input.close();
	}
}
