package apReview;

import java.util.*;

public class FormLetter {
	/** The list of lines that make up this form letter */
	private List<String> lines;
	/** The list of customers */
	private List<Customer> customers;

	/** ©return a copy of lines */
	public List<String> makeCopy() {
		List<String> newLines = new ArrayList<String>();
		for (String line : lines)
			newLines.add(line);
		return newLines;
	}

	/**
	 * Replace all occurrences of sub in line with replacement string, repl.
	 * 
	 * @param line        a String
	 * @param sub         a substring to be replaced
	 * @param replacement the replacement string Precondition: sub is not a
	 *                    substring of repl, the replacement string.
	 * @return line with each occurrence of sub replaced by replacement
	 */
	public String replaceAll(String line, String sub, String repl) {
		String[] words = line.split(" ");
		for (String temp : words) {
			if (sub.equals(temp)) {
				temp = repl;
			}
		}
		String bob = words[0];
		for (int i = 1; i < words.length; i++) {
			bob = bob.concat(words[i]);
		}
		return bob;
	}

	/**
	 * Write letter for one customer, using personalized lines contained in
	 * customerLines.
	 * 
	 * @param customerLines the personalized lines for one customer
	 */
	public void writeLetter(List<String> custLines) {
		/* implementation not shown */}

	/**
	 * Creates and prints a personalized form letter for each customer in the
	 * customers list. Postcondition: In each customer letter: - every occurrence of
	 * "@" is replaced by the customer's name; - every occurrence of "&" is replaced
	 * by the customer's city; - every occurrence of 11$
	 * 
	 * // is replaced by the customer's state. - A letter with the replacements is
	 * printed for each customer.
	 */
	public void createPersonalizedLetters() {
		String bob = lines.get(0);
		for (Customer temp : customers) {
			bob = this.replaceAll(lines.get(0), "@", temp.getName());

		}
		System.out.println(bob);
	}
}
