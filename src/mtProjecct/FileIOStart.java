package mtProjecct;

import java.util.*;
import java.io.*;

public class FileIOStart {
	public static void main(String[] args) throws IOException {
		File gamer = new File("D:/File.IO Test/gamerTime.txt");
		File gamer2 = new File("D:/File.IO Test/gamerTime.txt");
		Scanner input = new Scanner(gamer);
		Scanner input2 = new Scanner(gamer2);
		String bob = input.nextLine();
		String[] words = bob.split(" ");
		for (String temp : words) {
			if (temp.compareTo("n") == 0) {
				System.out.println("Yee Yee");
			} else {
				System.out.println("Gosh dangit");
			}
		}
		System.out.println(bob);

		input.close();
		input2.close();
	}
}
