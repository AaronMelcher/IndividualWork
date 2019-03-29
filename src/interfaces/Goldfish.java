package interfaces;

public class Goldfish implements Fish {
	private double length;
	private int age;
	private String color;

	public Goldfish(double x, int y, String z) {
		length = x;
		age = y;
		color = z;
	}

	public double getLength() {
		return length;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "Goldfish, Length: " + length + ", Age: " + age + ", Color: " + color;
	}
}
