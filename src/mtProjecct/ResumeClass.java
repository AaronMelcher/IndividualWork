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
		if(check.hasNext(word) == true) {
			count++;
		}
	}
	public int getNum() {
		return count;
	}
	public String toString() {
		return check.nextLine();
	}
}
