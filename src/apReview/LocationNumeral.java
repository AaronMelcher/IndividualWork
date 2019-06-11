package apReview;

public class LocationNumeral {
	/**
	 * Returns the decimal value of a single LN 'letter
	 *
	 * @param letter String containing a single LN letter
	 * @return the decimal value of that letter Precondition: the parameter contains
	 *         a single uppercase letter
	 */
	public int getLetterValue(String letter) {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < letters.length(); i++) {
			if (letters.substring(i, i + 1).equals(letter)) {
				return (int) Math.pow(2, i);
			}
		}
		return -1;
	}

	/**
	 * Return the Location Numeral letter representation for a decimal value that is
	 * a power of two.
	 *
	 * @param the decimal value to be converted to a Location Numeral letter
	 * @return the corresponding Location Numeral letter Precondition: The parameter
	 *         must be an integer power of two between 2 raised to the power O and 2
	 *         raised to the power 25.
	 */
	public String getLetter(int value) {
		// not asked to implement
		String bob = new String("Bob");
		return bob;
	}

	/**
	 * Returns the decimal value of a simplified Location Numeral
	 *
	 * @param numer a.l, String representing a Location Numeral
	 * @return the decimal value of the Location Numeral. Precondition: The
	 *         characters in the parameter are uppercase letters A-Z only.
	 */
	public int getDecimalValue(String numeral) {
		int tot = 0;
		for (int i = 0; i < numeral.length(); i++) {
			tot += this.getLetterValue(numeral.substring(i, i + 1));
		}
		return tot;
	}

	/**
	 * Sorts the letters of a Location Numeral into alphabetical order
	 *
	 * @param numeral String representing a Location Numeral
	 * @return the String in alphabetical order
	 */
	public String sortLocationNumeral(String numeral) {
		return numeral;
	}

	/**
	 * Adds two Location Numerals and returns a simplified result
	 *
	 * @param numl String representing the first addend as a LN
	 * @param num2 String representing the second addend as a LN
	 * @return String which represents the sum as a simplified LN
	 *
	 *         Precondition: The characters in the parameters are uppercase letters
	 *         A-Z only. Postcondition: The letters in the ~eturned String are in
	 *         alphabetical order and no letter occurs more than once.
	 */
	public String add(String num1, String num2) {
		String bob = this.sortLocationNumeral(num1 + num2);
		int num = this.getDecimalValue(bob);
		return this.getLetter(num);
	}
}
