package mtProjecct;

import java.io.*;
import java.util.*;

public class ResumeClass {
	private String word;
	private int count;
	private static File resume = new File("D:/File.IO Test/testDoc.txt");;
	private Scanner check;

	public ResumeClass() throws IOException {
		count = 0;
		check = new Scanner(resume);
		word = new String();
	}

	public ResumeClass(String xWord) throws IOException {
		count = 0;
		check = new Scanner(resume);
		word = xWord;
	}

	public void search() {
		String bob = check.nextLine();
		String[] words = bob.split(bob);
		for (int i = 0; i < words.length; i++) {
			if (word.equals(words[i])) {
				count++;
			}
		}
	}

	public int getNum() {
		return count;
	}
}
