package recursion;

public class RecursionExample1 {
	public RecursionExample1() {
		
	}
	public void printHello(int how) {
		System.out.println(how + " begins");
		if(how > 0) {
			System.out.println("Hello");
			printHello(how - 1);
		}
		System.out.println(how + " ends");
		System.out.println("Goodbye");
	}
}
