package apReview;

import java.util.*;

public class MarbleCollection {
	private List<MarbleSet> sets;

	public MarbleCollection() {
		sets = new ArrayList<MarbleSet>();
	}

	public void addSet(MarbleSet s) {
		sets.add(s);
	}

	public int getTotalMarbles() {
		int tot = 0;
		if (sets.size() > 0) {
			for (int i = 0; i < sets.size(); i++) {
				tot += sets.get(i).getNum();
			}
			return tot;
		} else {
			return 0;
		}
	}
	
	public int removeColor(String c) {
		int tot = 0;
		for(int i = 0; i < sets.size(); i++) {
			if(sets.get(i).getColor().equals(c)) {
				tot += sets.get(i).getNum();
				sets.remove(i);
			}
		}
		return tot;
	}
}
