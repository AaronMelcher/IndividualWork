package inheritance;

import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		ArrayList<Employee> people = new ArrayList<Employee>();
		int min = 2;
		int max = 40;
		int min1 = 5;
		int max1 = 50;
		for (int i = 0; i < 6; i++) {
			people.add(new Worker("Bob", min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1)));
			people.add(new Manager("Rob", min1 + bob.nextInt(max1 - min1 + 1), min1 + bob.nextInt(max1 - min1 + 1)));
		}
	}

}
