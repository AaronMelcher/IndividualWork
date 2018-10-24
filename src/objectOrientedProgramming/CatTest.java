package objectOrientedProgramming;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bob = new Cat(4, 10);
		bob.birthday();
		bob.sleepMore(5);
		bob.sleepLess(3);
		System.out.println(bob.age());
		System.out.println(bob.sleep());
	}

}
