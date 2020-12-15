final class A
{
	void printmsg()
	{
		System.out.print("Base Class Method is executed.");
	}
}
class B extends A
{
	void printmsg()
	{
		System.out.print("Derived class method is executed");
	}
}
public class FinalClassExample {

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.printmsg();
	}

}
