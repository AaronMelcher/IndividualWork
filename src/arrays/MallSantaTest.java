package arrays;

import java.util.Scanner;

public class MallSantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		String name = "Bob Smith";
		boolean record = false;
		final int TOTAL = 2;
		MallSanta[] santas = new MallSanta[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			System.out.println("Enter their name:");
			name = input.nextLine();
			System.out.println("Enter their age:");
			age = input.nextInt();
			System.out.println("Do they have a criminal record (true or false)?");
			record = input.nextBoolean();
			input.nextLine();
			santas[i] = new MallSanta(name, age, record);
		}
		System.out.println("Employable Santas: ");
		for (int j = 0; j < TOTAL; j++) {
			if (santas[j].employable() == true) {
				System.out.print(santas[j].getName() + " ");
			}
		}
		input.close();
	}

}
