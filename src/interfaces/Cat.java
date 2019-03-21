package interfaces;

public class Cat implements Animal{
	private String name;
	private int age;
	private boolean friendly;

	public Cat() {
		name = "God Himself";
		age = 4;
		friendly = true;
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
		return "Name: " + name + " Age: " + age + " Injured: " + friendly;
	}

	public boolean isFriendly() {
		return friendly;
	}
}
