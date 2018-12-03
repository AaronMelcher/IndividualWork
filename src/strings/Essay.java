package strings;

public class Essay {
	private String name;
	private String text;

	public Essay() {

	}

	public void setName(String bob) {
		name = bob;
	}

	public void setText(String bob) {
		text = bob;
	}

	public String capital() {
		String bob = name.substring(name.indexOf(' '));
		return bob.toUpperCase();
	}

	public int numberLetters() {
		String bob = name.substring(0, name.indexOf(' '));
		return bob.length();
	}

	public boolean predicate() {
		boolean bob = false;
		if (name.contains("X") == true || name.contains("x") == true) {
			bob = true;
			return bob;
		} else {
			bob = false;
			return bob;
		}
	}

	public int numEssay() {
		int words = 0;
		for (int j = 0; j < text.length(); j++) {
			if (text.charAt(j) == ' ') {
				words++;
			}
		}
		return words+1;
	}
}