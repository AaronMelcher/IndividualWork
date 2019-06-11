package interfaces;

import java.util.Random;

public class Cat implements Animal {
	private String name;
	private int age;
	private boolean friendly;

	public Cat() {
		Random bob = new Random();
		name = "God Himself";
		age = 4;
		int max = 2;
		int min = 1;
		int num = min + bob.nextInt(max - min + 1);
		if (num == 1) {
			friendly = true;
		} else {
			friendly = false;
		}
	}

	public void act() {
		age += 9;
		if (friendly == true) {
			friendly = false;
		} else {
			friendly = true;
		}
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " Friendly: " + friendly;
	}

	public boolean isFriendly() {
		return friendly;
	}
}
