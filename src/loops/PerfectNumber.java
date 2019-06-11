package loops;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		int perfect = 0;
		for(int i = 1; i <= 1000; i++) {
			num = i;
			for(int j = 1; j <= i; j++) {
				if(num%j == 0) {
					sum += j;
					perfect = i;
				}
				if(perfect == sum) {
					System.out.print(perfect);
				}
			}
		}
	}
}
