package comparableInterface;

import java.util.Random;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerStart[] workers = new WorkerStart[100];
		Random bob = new Random();
		int max = 10;
		int min = 2;
		int max1 = 12;
		int min1 = 2;
		for (int i = 0; i < 100; i++) {
			int h = min1 + bob.nextInt(max1 - min1 + 1);
			double r = min + bob.nextInt(max - min + 1);
			workers[i] = new WorkerStart(h, r);
		}
		WorkerStart smallest = workers[0];
		WorkerStart largest = workers[workers.length - 1];
		for (int i = 1; i < workers.length; i++) {
			if (smallest.compareTo(workers[i]) < 0) {
				smallest = workers[i];
			}
			if (largest.compareTo(workers[i]) > 0) {
				largest = workers[i];
			}
		}
		System.out.println(smallest.getRate());
	}

}
