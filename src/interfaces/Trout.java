package interfaces;

public class Trout implements Fish {
	private double length;
	private int age;
	private double numScales;

	public Trout(double x, int y, double z) {
		length = x;
		age = y;
		numScales = z;
	}

	public double getLength() {
		return length;
	}

	public int getAge() {
		return age;
	}

	public double getNumScales() {
		return numScales;
	}

	public String toString() {
		return "Trout, Length: " + length + ", Age: " + age + ", Number of Scales: " + numScales;
	}
}
