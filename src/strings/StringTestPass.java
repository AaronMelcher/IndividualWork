package strings;

public class StringTestPass {
	private String pass;

	public StringTestPass() {
		pass = "1aaaaa!?";
	}

	public boolean setPass(String xPass) {
		boolean bob = false;
		if (xPass.contains("!") && xPass.contains("?") && xPass.charAt(0) >= 48 && xPass.charAt(0) <= 57
				&& !xPass.contains(" ") && xPass.length() > 7 && xPass.length() < 22) {
			pass = xPass;
			return bob = true;
		} else {
			return bob;
		}
	}

	public boolean match(String xPass) {
		boolean bob = false;
		if (xPass.equals(pass) == true) {
			return bob = true;
		} else {
			return bob;
		}
	}
}