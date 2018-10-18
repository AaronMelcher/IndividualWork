package objectOrientedProgramming;

public class Cat {
	private int age;
	private int sleep;
	public Cat(){
		age = 0;
		sleep = 0;
	}
	public Cat(int newAge, int newSleep) {
		age = newAge;
		sleep = newSleep;
	}
	public void birthday(){
		age = age+1;
	}
	public void sleepMore(int add) {
		sleep = sleep+add;
	}
	public void sleepLess(int sub) {
		sleep = sleep-sub;
	}
	public int age() {
		return age;
	}
	public int sleep(){
		return sleep;
	}
	
}
