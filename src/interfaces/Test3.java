package interfaces;

public class Test3 {

	public static void main(String[] args) {
		Teacher bob = new Teacher();
		Student fred = new Student();
		bob.setName("Lisa Rettler");
		bob.payMe();
		fred.setName("Mark Smith");
		fred.outSick();
		fred.outSick();
		fred.outSick();
		Person display = bob;
		System.out.println(display.toString());
		display = fred;
		System.out.println(display.toString());
	}
}
