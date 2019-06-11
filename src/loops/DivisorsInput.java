package loops;
import java.util.Scanner;
public class DivisorsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int largest = 0;
		int num = 1;
		System.out.println("Enter a number:");
		int numCap = input.nextInt();
		for (int j = 1; j <= numCap; j++) {
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
		input.close();
	}

}
