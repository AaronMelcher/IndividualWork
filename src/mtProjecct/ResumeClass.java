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
		word = xWord;
		check = new Scanner(resume);

	}

	public void search() {
		String bob = check.nextLine();
		String[] words = bob.split(" ");
		for (String temp : words) {
			if (temp.compareToIgnoreCase(word) == 0) {
				count++;
			}
		}
		check.close();
	}

	public int getNum() {
		return count;
	}

	public boolean exist() {
		return resume.exists();
	}

	public String word() {
		return word;
	}
}
