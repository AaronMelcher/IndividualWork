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
		int i = 0;
		input.nextLine();
		while (i < num) {
			System.out.println("Enter your word:");
			searching.add(new ResumeClass(input.nextLine()));
			i++;
		}
		for (ResumeClass temp : searching) {
			temp.search();
			System.out.println(temp.word() + " appears " + temp.getNum() + " times");
		}
		input.close();
	}
}
