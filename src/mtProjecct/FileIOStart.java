package mtProjecct;

import java.util.*;
import java.io.*;

public class FileIOStart {
	public static void main(String[] args) throws IOException {
		File gamer = new File("D:/File.IO Test/gamerTime.txt");
		File gamer2 = new File("D:/File.IO Test/gamerTime.txt");
		Scanner input =  new Scanner(gamer);
		Scanner input2 = new Scanner(gamer2);
		while (input.hasNext())
		{
			System.out.println(input.nextLine());
		}

		while (input2.hasNext()){
			System.out.println(input2.next());
		}

		input.close();
		input2.close();
	}
}
