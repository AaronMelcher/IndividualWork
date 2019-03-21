package interfaces;

import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Student());
		for (Person x : people) {
			System.out.println(x.getName());
			if (x instanceof Student) {
				Student temp = (Student) x;
				temp.outSick();
			}
		}
		System.out.println();
		for(Person x : people) {
			if(x instanceof Teacher) {
				Teacher temp = (Teacher)x;
				temp.payMe();
			}
			if(x instanceof Student) {
				System.out.println(x.getName());
			}
		}
	}
}
 