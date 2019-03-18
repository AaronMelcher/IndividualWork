package apReview;

public class MC34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		for (int x = 0; x < nums.length; x++) {
			int temp = nums[x][0];
			nums[x][0] = nums[x][2];
			nums[x][2] = temp;
		}
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				System.out.println(nums[i][j]);
			}
		}
	}

}
