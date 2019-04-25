package apReview;

public class BinaryInt {
	private String num;

	public BinaryInt() {
		num = "0";
	}

	public BinaryInt(String n) {
		// this would have the stuff for number transformation
		num = n;
	}

	public String addNum(String a) {
		// would have necessary code if asked for
		return num + a;
	}

	public String returnNum() {
		return num;
	}

	public int compare(String c) {
		if (num.compareTo(c) == 0) {
			return 0;
		} else if (num.compareTo(c) < 0) {
			return -1;
		} else {
			return 1;
		}

	}
}
