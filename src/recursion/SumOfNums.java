package recursion;

public class SumOfNums {
	public int sum(int yee) {
		if(yee > 0) {
			return(yee + sum(yee-1));
		}
		return 0;
	}
	public int oddSum(int yee) {
		if(yee > 0 && yee%2 != 2) {
			return(yee + oddSum(yee-2));
		}
		return 0;
	}
}
