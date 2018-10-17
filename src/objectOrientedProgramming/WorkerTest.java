package objectOrientedProgramming;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		bob.totHours(47);
		bob.setWage(34.50);
		bob.raise(5);
		System.out.println(bob.getHours());
		System.out.println(bob.getWage());
		System.out.println(bob.payCheck());
	}

}
