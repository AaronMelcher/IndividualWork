package apReview;

public class Customer {
	private String name;
	private String city;
	private String state;
	
	public Customer(String n, String c, String s) {
		name = n;
		city = c;
		state = s;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
}
