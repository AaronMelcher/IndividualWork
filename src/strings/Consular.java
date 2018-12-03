package strings;

import java.util.Scanner;

public class Consular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many names are there?");
		int names = input.nextInt();
		String bob = new String();
		String williams = new String();
		String smith = new String();
		String jackson = new String();
		String bond = new String();
		for (int i = 1; i <= names; i++) {
			System.out.println("Enter another name:");
			bob = input.next();
			if (bob.charAt(0) >= 65 && bob.charAt(0) <= 71) {
				williams = bob + ' ' + williams;
			} else {
				if (bob.charAt(0) >= 72 && bob.charAt(0) <= 78) {
					smith = bob + ' ' + smith;
				} else {
					if(bob.charAt(0) >= 79 && bob.charAt(0) <= 83) {
						if(bob.charAt(0) == 83) {
							if(bob.charAt(1) >= 97 && bob.charAt(1) <= 116) {
								
							}
						}
					}
				}
			}
		}
		System.out.println("Williams: " + williams);
		input.close();
	}
}
