package loops;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;

		for (int i = rows; i > 0; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.print(i);
			System.out.println("");
		}

	}
}
