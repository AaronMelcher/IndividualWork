package objectOrientedProgramming;

public class TestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers bob = new Numbers();
		bob.sayNumber(3);
		bob.sayNumberPlus2(3);
		bob.saySum(3,4);
		double num = bob.returnSquare(5);
		System.out.println(num);
		double area = bob.area(6, 7);
		System.out.println(area);
		int round = bob.roundUp(4.53);
		System.out.println(round);
	}

}
