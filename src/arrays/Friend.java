package arrays;

public class Friend {
	private String name;
	private int age;

	public Friend() {
		name = "";
		age = 0;
	}

	public Friend(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public boolean search(String fn, String ln, int a) {
		if (name.substring(0, name.indexOf(" ")) == fn && name.substring(name.indexOf(" ") + 1) == ln && age == a) {
			return true;
		} else {
			return false;
		}
	}

}
