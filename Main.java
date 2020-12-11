class Test
{
	// private variables
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Test test = new Test();
		
		//set value of private variables
		test.setAge(24);
		test.setName("Programiz");
		
		//get value of private variables
		System.out.println("Age :" + test.getAge());
		System.out.println("Name :" + test.getName());
	}
}
