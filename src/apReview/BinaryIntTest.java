package apReview;

public class BinaryIntTest {
	public static void Test() {
		BinaryInt bob = new BinaryInt(223); // lowered values to fit inside of data type
		BinaryInt bob1 = new BinaryInt(301);
		BinaryInt fred = new BinaryInt(210);
		BinaryInt fred1 = new BinaryInt(212);
		bob.switchType(); //switch to binary
		bob1.switchType();
		fred.switchType(); 
		fred1.switchType();
		bob.add(bob1.getNum()); //add two sets together
		fred.add(fred1.getNum());
		if (bob.getNum() > fred.getNum()) { // check to see which is larger
			System.out.println(bob.getNum());
		} else {
			System.out.println(fred.getNum());
		}

	}
}
