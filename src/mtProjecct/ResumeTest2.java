package mtProjecct;

import java.util.*;
import java.io.*;

public class ResumeTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		ResumeClass bob = new ResumeClass(input.nextLine());
		bob.search();
		System.out.println(bob.getNum());
		System.out.println(bob.word());
		input.close();
	}

}
