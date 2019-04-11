package inheritance;

public class Employee {
	private String name;
	private double pay;
	
	public Employee() {
		name = "Bob";
		pay = 7.25;
	}

	public Employee(String n, double p) {
		name = n;
		pay = p;
	}

	public String getName() {
		return name;
	}

	public double getPay() {
		return pay;
	}

	public double calculatePay(int h) {
		return pay * h;
	}

	public String toString() {
		return "Employee: Name= " + name + " Pay= " + pay;
	}

	public boolean equals(Employee temp) {
		return this.toString().equals(temp.toString());
	}
}
