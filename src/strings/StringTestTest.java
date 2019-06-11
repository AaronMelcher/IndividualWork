package strings;

import java.util.Scanner;

public class StringTestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StringTestPass bob = new StringTestPass();
		String xPass = "Yeet";
		String confirm = "Yeet";
		boolean flag1 = false;
		boolean flag2 = false;
		boolean contin = true;
		int valid = 0;
		int confim = 0;
		while (contin) {
			if (flag1 == false) {
				System.out.println("Enter a password in the format: LastName:Password");
				xPass = input.nextLine();
				xPass = xPass.substring(xPass.indexOf(":") + 1);
			}
			if (flag1 == false) {
				if (bob.setPass(xPass) == true) {
					flag1 = true;
					valid++;
				} else {
					valid++;
					System.out.println("Invalid password, please try again");
				}
			}
			if (flag1 == true && flag2 == false) {
				System.out.println("Please confirm your password.");
				confirm = input.nextLine();
				if (bob.match(confirm) == true) {
					flag2 = true;
					confim++;
				} else {
					confim++;
					System.out.println("Incorrect, please try again.");
				}
			}
			if (flag1 == true && flag2 == true) {
				contin = true;
				break;
			}
		}
		System.out.println("It took " + valid + " times to set a valid password.");
		System.out.println("It took " + confim + " times to confirm the password");
		input.close();
	}
}