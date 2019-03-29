package interfaces;

import java.util.*;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fish> fishes = new ArrayList<Fish>();
		Random bob = new Random();
		int max = 1000;
		int min = 1;
		for (int i = 0; i < 5; i++) {
			fishes.add(new Trout(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1),
					min + bob.nextInt(max - min + 1)));
			fishes.add(new Goldfish(min + bob.nextInt(max - min + 1), min + bob.nextInt(max - min + 1), "Orange"));
		}
		Fish longest = new Trout(0, 0, 0);
		Trout oldest = new Trout(0, 0, 0);
		Goldfish longer = new Goldfish(0, 0, "Blue");
		for (Fish temp : fishes) {
			if (temp.getLength() > longest.getLength()) {
				longest = temp;
			}
			if (temp instanceof Trout) {
				Trout temp2 = (Trout) temp;
				if (temp2.getAge() > oldest.getAge()) {
					oldest = temp2;
				}
			}
			if (temp instanceof Goldfish) {
				Goldfish temp2 = (Goldfish) temp;
				if (temp2.getLength() > longer.getLength()) {
					longer = temp2;
				}
			}
		}
		System.out.println(longest.toString());
		System.out.println(longer.getColor());
		System.out.println(oldest.getNumScales());
	}

}
