package interfaces;

import java.util.Random;

public class Dog implements Animal{
	private String name;
	private int age;
	private boolean injured;

	public Dog() {
		name = "Fighto";
		age = 2;
		injured = false;
	}

	public void act() {
		Random bob = new Random();
		age += 7;
		injured = false;
		int max = 50;
		int min = 1;
		int num = min + bob.nextInt(max - min + 1);
		if(num == 8) {
			injured = true;
		}
	}
	public String toString() {
		return "Name: " + name + " Age: " + age + " Injured: " + injured;
	}
	public void vet() {
		injured = false;
	}
}
