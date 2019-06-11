package objectOrientedProgramming;

public class BankAccount {
	private double balance;
	private double interest;
	private int pin;
	public BankAccount() {
		
	}
	public BankAccount(double xBalance, double xInterest, int xPin) {
		balance = xBalance;
		interest = xInterest;
		pin = xPin;
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
		interest = xInterest/100;
	}
	public void setPin(int xPin) {
		pin = xPin;
	}
	public int getPin() {
		return pin;
	}
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	public void addInterest(int month) {
		double add = balance*(1+(interest*month));
		balance += add;
	}
	public void financeCharge(double charge) {
		balance -= charge;
	}
}
