package comparableInterface;

import java.util.Random;

public class SortRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random();
		int size = 100;
		int min = 1;
		int max = 100000;
		int[] nums = new int[100];
		for (int i = 0; i < size; i++) {
			nums[i] = min + bob.nextInt(max - min + 1);
		}
		JavaSorting.selectionSortAscending(nums);
	}

}
