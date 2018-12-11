package arrays;

public class MallSanta {
	private String name;
	private int age;
	private boolean record;
	public MallSanta(String nameX, int ageX, boolean recordX) {
		name = nameX;
		age = ageX;
		record = recordX;
	}
	public String getName() {
		return name;
	}
	public boolean employable() {
		if(age >= 50 && age <= 70 && record == false) {
			return true;
		}
		return false;
	}
}
