package objectOrientedProgramming;

public class Numbers {
	public Numbers() {

	}

	public void sayNumber(int num) {
		System.out.println(num);
	}

	public void sayNumberPlus2(int num) {
		System.out.println(num + 2);
	}

	public void saySum(int num, int num2) {
		int result = num + num2;
		System.out.println(result);
	}
	public double returnSquare(double num)
	{
		double numFinal = Math.pow(num, 2);
		return numFinal;
	}
	public double area(double length, double width)
	{
		double result = length*width;
		return result;
	}
	public int roundUp(double num)
	{
		int round = (int)Math.ceil(num);
		return round;
	}
}
