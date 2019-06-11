package apReview;

import java.util.*;

public class Train {
	private Engine engine;
	private ArrayList<PassangerCar> cars = new ArrayList<PassangerCar>();

	public Train(Engine x, ArrayList<PassangerCar> list) {
		engine = x;
		cars = list;
	}

	public ArrayList<PassangerCar> removeExcess() {
		double weight = 0;
		ArrayList<PassangerCar> removed = new ArrayList<PassangerCar>();
		for (PassangerCar temp : cars) {
			weight += temp.weight();
		}
		do {
			if(engine.getMaximumWeight() - weight < 0.0001) {
				removed.add(cars.get(cars.size() - 1));
				weight -= cars.get(cars.size()).weight();
				cars.remove(cars.size() - 1);
			}
		}while(engine.getMaximumWeight() - weight > 0.00001);
		return removed;
	}
}
