abstract class Mathematical
{
	int a = 30 , b = 40;
	public abstract void add();
}
class Operation extends Mathematical
{
	public void add()
	{
		System.out.println("sum of a and b is :"+ a+b);
	}
}
public class AbstractClassExample {

	public static void main(String[] args) 
	{
		Mathematical obj = new Operation();
		obj.add();
	}

}
