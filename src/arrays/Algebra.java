package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Algebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> algebra = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		int num = 0;
		String name = new String();
		int score = 0;
		System.out.println("How many sutdents?");
		num = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a student name:");
			name = input.nextLine();
			System.out.println("Enter their test score:");
			score = input.nextInt();
			input.nextLine();
			algebra.add(new Student(name, score));
		}
		String nameH = new String();
		String nameL = new String();
		int high = 0;
		int low = 999;
		System.out.println(" ");
		System.out.println("Enter a name you want to remove:");
		String remove = input.nextLine();
		for (int l = 0; l < algebra.size(); l++) {
			if (remove.compareTo(algebra.get(l).returnName()) == 0) {
				algebra.remove(l);
			}
			for (int k = 0; k < algebra.size(); k++) {
				if (algebra.get(k).returnScore() > high) {
					nameH = algebra.get(k).returnName();
					high = algebra.get(k).returnScore();
				}
				if (algebra.get(k).returnScore() < low) {
					nameL = algebra.get(k).returnName();
					low = algebra.get(k).returnScore();
				}
			}
			for (int j = 0; j < algebra.size(); j++) {
				System.out.println(algebra.get(j).returnName() + " " + algebra.get(j).returnScore());
			}
			System.out.println("Student with highest score: " + nameH);
			System.out.println("Student with the lowest score: " + nameL);
			input.close();
		}
	}
}
