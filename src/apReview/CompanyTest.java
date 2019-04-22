package apReview;

import java.util.*;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees?");
		int num = input.nextInt();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < num; i++) {
			employees.add(new Employee());
		}
		System.out.println("Enter a dollar ammount");
		double raise = input.nextDouble();
		employees.get(employees.size()).modRate(raise);
		for (Employee temp : employees) {
			System.out.println("Employee " + temp.getMyNum() + "; Week 3 Pay: " + temp.calcPay(3));
		}
		double total = 0;
		for (Employee temp : employees) {
			for (int i = 0; i < 52; i++) {
				total += temp.calcPay(i);
			}
		}
		System.out.println("Total Pay: " + total);
		input.close();
	}

}
