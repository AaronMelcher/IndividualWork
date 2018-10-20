package objectOrientedProgramming;

public class BankAccount {
	private double balance;
	private double interest;
	public BankAccount() {
		
	}
	public BankAccount(double xBalance, double xInterest) {
		balance = xBalance;
		interest = xInterest;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setBalance(double xBalance) {
		balance = xBalance;
	}
	public void setInterst(double xInterest) {
		interest = xInterest;
	}
	public void charge(double xCharge) {
		balance -= xCharge;
	}
	
}
