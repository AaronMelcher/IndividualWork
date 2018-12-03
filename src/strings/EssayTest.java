package strings;

import java.util.Scanner;

public class EssayTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Essay bob = new Essay();
		System.out.println("What is your name?");
		bob.setName(input.nextLine());
		System.out.println("Enter your essay:");
		bob.setText(input.nextLine());
		System.out.println(bob.capital());
		System.out.println(bob.numberLetters());
		System.out.println(bob.predicate());
		System.out.println(bob.numEssay());
		input.close();
	}
}
