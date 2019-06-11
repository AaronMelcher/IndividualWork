package objectOrientedProgramming;

public class Greeter {
	private int age;
	public Greeter() 
	{
		age = -999;
	}
	public void sayHello()
	{
	System.out.println("Hello");	
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int xAge)
	{
		age = xAge;
	}
}
