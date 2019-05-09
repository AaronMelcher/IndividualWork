package elevensLab;

public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 11 };
		Shuffler.selectionShuffle(values);
		Deck bob = new Deck(ranks, suits, values);
		System.out.println(bob.toString());

	}
}
