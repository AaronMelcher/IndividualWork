package apReview;

public class MC21 {

	public MC21() {

	}

	public int doStuff(int[] nums) {
		int index = 0;
		int value = 1;
		int counter = 1;
		for (int k = 1; k < nums.length; k++) {
			if (nums[k] == nums[k - 1]) {
				if (counter <= value) {
					value = counter;
					index = k;
				}
				counter++;
			} else {
				counter = 1;
			}
		}
		return nums[index];
	}

}
