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
	}
	public int returnNum(int cool) {
		if(cool > 0) {
			return(cool + returnNum(cool-1));
		}
		return 0;
	}
}
