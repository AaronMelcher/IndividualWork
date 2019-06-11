package apReview;

import java.util.*;

public class PrintingFactory {
	// All machines available in the company
	private Machine[] machines;
	// The available full paper rolls (1000 meters each)
	private ArrayList<PaperRoll> newRolls = new ArrayList<PaperRoll>();
	// The used paper roll remnants (less than 4.0 meters each)
	private ArrayList<PaperRoll> usedRolls = new ArrayList<PaperRoll>();

	public PrintingFactory(int numMachines) {
		machines = new Machine[numMachines];
	}

	public void replacePaperRolls(PaperRoll roll) {
		for (Machine temp : machines) {
			if (temp.getPaperRoll().getMeters() < 4) {
				usedRolls.add(temp.replacePaper(newRolls.remove(newRolls.size() - 1)));
			}
		}
	}

	public double getPaperUsed() {
		double total = 0;
		for (Machine temp : machines) {
			total += 1000 - temp.getPaperRoll().getMeters();
		}
		for (PaperRoll temp : usedRolls) {
			total += 1000 - temp.getMeters();
		}
		return total;
	}
}
