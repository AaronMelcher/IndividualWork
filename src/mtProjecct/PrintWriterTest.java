package mtProjecct;

import java.io.*;
import java.util.*;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		Scanner input2 = new Scanner(System.in);
		File gamer = new File("D:/File.IO Test/gamerTime.txt");
		File gamer2 = new File("D:/File.IO Test/gamerTime.txt");
		Scanner input = new Scanner(gamer);
		PrintWriter output = new PrintWriter(gamer2);
		System.out.println("Type something");
		String test = input2.nextLine();
		output.print(test);
		input.close();
		output.close();
		input2.close();

	}

}
