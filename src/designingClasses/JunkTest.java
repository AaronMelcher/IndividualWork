package designingClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class JunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PileOJunk> junk = new ArrayList<PileOJunk>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many classes?");
		int cap = input.nextInt();
		for(int i = 0; i < cap; i++) {
			junk.add(new PileOJunk());
		}
		for(PileOJunk test : junk) {
			System.out.println(test.info());
		}
		
		input.close();
	}

}
