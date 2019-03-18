package apReview;
import java.util.*;
public class Train {
	private Engine engine;
	private ArrayList<PassangerCar> cars =  new ArrayList<PassangerCar>();
	
	public Train(Engine x, ArrayList<PassangerCar> list) {
		engine = x;
		cars = list;
	}
	
	public ArrayList<PassangerCar> removeExcess(){
		double weight = 0;
		ArrayList<PassangerCar> removed = new ArrayList<PassangerCar>();
		for(PassangerCar temp : cars) {
			weight += temp.weight();
		}
		if(weight - engine.getMaximumWeight() < 0.0001) {
			return removed;
		}
	}
}
