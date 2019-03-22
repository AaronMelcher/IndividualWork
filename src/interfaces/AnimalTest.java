package interfaces;

import java.util.*;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> pets = new ArrayList<Animal>();
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());
		for (Animal temp : pets) {
			temp.act();
			System.out.println(temp.toString());
		}
		for (Animal temp : pets) {
			if (temp instanceof Dog) {
				((Dog) temp).vet();
			}
		}
		for (int i = pets.size() - 1; i > 0; i--) {
			if (pets.get(i) instanceof Cat) {
				if (!((Cat) pets.get(i)).isFriendly()) {
					pets.remove(i);
					break;
				}
			}
		}
		System.out.println();
		for (Animal temp : pets) {
			System.out.println(temp.toString());
		}

	}

}
