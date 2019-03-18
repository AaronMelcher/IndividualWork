package apReview;

public class AlterImage {
	private int[][] red;
	private int[][] green;
	private int[][] blue;

	public AlterImage(int[][] r, int[][] g, int[][] b) {
		red = r;
		green = g;
		blue = b;
	}

	public Pixel[][] generate() {
		Pixel[][] bob = new Pixel[red.length][red[0].length];
		for (int i = 0; i < bob.length; i++) {
			for (int j = 0; j < bob[0].length; j++) {
				bob[i][j] = new Pixel(red[i][j], green[i][j], blue[i][j]);
			}
		}
		return bob;
	}

	public Pixel[][] flip(Pixel[][] bob, boolean way) {
		if (way == false) {
			Pixel[] temp = new Pixel[bob.length];
			for (int row = 0; row < bob.length / 2; row++) {
				temp = bob[(bob.length) - row - 1];
				bob[bob.length - row - 1] = bob[row];
				bob[row] = temp;
			}
		} else {
			for (int row = 0; row < bob.length; row++) {
				for (int col = 0; col < bob[0].length / 2; col++) {
					Pixel temp = bob[row][(bob[0].length) - col - 1];
					bob[row][bob[0].length - col - 1] = bob[row][col];
					bob[row][col] = temp;
				}
			}
		}
		return bob;
	}
}