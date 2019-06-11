package elevensLab;

/**
 * This is a class that tests the Card class.
 */

public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card("3", "Hearts", 5);
		Card c1 = c;
		System.out.println(c.matches(c1));
		System.out.println(c.toString() + "\n" + c1.toString());
	}

}
