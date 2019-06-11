package designingClasses;

import java.util.Random;

public class PileOJunk {
	private static int idNum = 1;
	private int myId;
	private int num;

	public PileOJunk() {
		Random bob = new Random();
		int max = 101;
		int min = 10;
		myId = idNum;
		idNum++;
		num = min + bob.nextInt(max - min + 1);
	}

	public static int sum(int x, int y) {
		return (x + y);
	}

	public void changeNum(int num) {
		this.num = num;
	}
	public String info() {
		return "ID " + myId + " Random Number "+ num;
	}
}
