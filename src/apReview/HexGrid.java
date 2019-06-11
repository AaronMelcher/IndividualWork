package apReview;

import java.util.*;

public class HexGrid {
	private GamePiece[][] grid;

	public int getGamePieceCount() {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] != null) {
					count++;
				}
			}
		}
		return count;
	}

	public ArrayList<GamePiece> isAbove(int row, int col) {
		ArrayList<GamePiece> aboveStuff = new ArrayList<GamePiece>();
		if (grid[row][col] != null) {
			for (int i = row; i >= 0; i--) {
				if (grid[i][col] != null) {
					aboveStuff.add(grid[i][col]);
				}
			}
		}
		return aboveStuff;
	}

	public boolean addRandom(int num) {
		Random bob = new Random();
		int empty = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] != null) {

				} else {
					empty++;
				}
			}
		}
		if (empty < num) {
			return false;
		} else {
			for (int i = 0; i < num; i++) {
				int r = bob.nextInt(grid.length);
				int c = bob.nextInt(grid[0].length);
				if (grid[r][c] != null) {
				} else {
					grid[r][c] = new GamePiece();
				}
			}
			return true;
		}
	}
}
