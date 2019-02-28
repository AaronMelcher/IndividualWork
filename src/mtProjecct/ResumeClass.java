package mtProjecct;

import java.io.*;
import java.util.*;

public class ResumeClass {
	private String word;
	private int count;
	private File resume;
	private Scanner check;

	public ResumeClass() throws IOException {
		count = 0;
		resume = new File("D:/File.IO Test/testDoc.txt");
		check = new Scanner(resume);
	}
}
