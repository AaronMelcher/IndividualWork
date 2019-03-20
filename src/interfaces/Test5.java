package interfaces;

import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Student());
		people.add(new Student());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Teacher());
		people.add(new Teacher());
		for (Person x : people) {
			System.out.println(x.getName());
			System.out.println(x.toString());
		}
	}
}
