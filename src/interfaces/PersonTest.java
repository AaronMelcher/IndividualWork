package interfaces;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Teacher();
		System.out.println(bob.getName() + " " + bob.getAge());
		bob = new Student();
		System.out.println(bob.getName() + " " + bob.getAge());
	}

}
