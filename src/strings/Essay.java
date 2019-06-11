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
		String bob = name.substring((name.indexOf(' ')+1));
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
		boolean contin = true;
		for (int j = 0; contin;) {
			String full = text.substring(j);
			if (!(full.contains(" "))) {
				contin = false;
			}
			words++;
			j += full.indexOf(32) + 1;
		}
		return words + 1;
	}
}