package objectOrientedProgramming;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bob = new BankAccount(); // savings account
		BankAccount fred = new BankAccount(); // checking account
		Scanner input = new Scanner(System.in);
		System.out.println("What is the balance of the savings account?");
		bob.setBalance(input.nextDouble());
		System.out.println("What is the balance of the checking account?");
		fred.setBalance(input.nextDouble());
		System.out.println("What is the interest rate of the savings account?");
		bob.setInterst(input.nextDouble());
		System.out.println("What is the interest rate of the checking account?");
		fred.setInterst(input.nextDouble());
		bob.deposit(100);
		fred.setInterst(18);
		fred.withdraw(1000);
		bob.addInterest(12);
		fred.financeCharge(250);
		System.out.println("Savings account balance:"+bob.getBalance());
		System.out.println("Checking account balance"+fred.getBalance());
		input.close();
	}

}
