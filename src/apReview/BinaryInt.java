package apReview;

public class BinaryInt {
	private int num;
	private String bin;

	public BinaryInt() {
		num = 0;
		bin = "0";
	}

	public BinaryInt(int dec) {
		// math for decimal to binary
		num = dec;
	}

	public int add(int n) {
		// math
		return num + n;
	}

	public String switchType() {
		// something to convert num to bin
		String dig = "";
		double num1 = num;
		while (num1 > 0) {
			if (num1 % 2 == 1) {
				dig = "1";
			} else {
				dig = "0";
			}
			bin = dig + bin;
			num1 /= 2;
		}
		return bin;
	}

	public int check(int c) {
		// would have stuff checking for equal, less, more
		return 1;
	}

	public void createBinaryInt(int dec) {
		String dig = "";
		double num1 = dec;
		while (num1 > 0) {
			if (num1 % 2 == 1) {
				dig = "1";
			} else {
				dig = "0";
			}
			bin = dig + bin;
			num1 /= 2;
		}
	}
	public int getNum() {
		return num;
	}
}
