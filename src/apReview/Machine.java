package apReview;

public class Machine {
	private PaperRoll paper;

	public Machine(PaperRoll roll) {
		paper = roll;
	}

	public PaperRoll getPaperRoll() {
		return paper;
	}

	/**
	 * Returns the current partial roll and replaces it with the new roll,
	 * 
	 * @param pRoll a new full PaperRoll
	 * @return the old nearly empty PaperRoll
	 */
	public PaperRoll replacePaper(PaperRoll pRoll) {
		PaperRoll bob = new PaperRoll();
		if (paper.getMeters() > 4) {
			bob = paper;
			paper = pRoll;
		}
		return bob;
	}
}
