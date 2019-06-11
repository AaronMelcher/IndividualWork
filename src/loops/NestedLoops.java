package loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int largest = 0;
		int num = 1;
		for (int j = 1; j <= 1000; j++) {
			count = 0;
			for (int i = 2; i <= j/2; i++) {
				if (j % i == 0) {
					count++;
				}
				if (count > largest) {
					largest = count;
					num = j;
				}
			}
		}
		System.out.println(largest+" "+num);
	}
}