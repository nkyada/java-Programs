
public class StaticClassExample 
{
	private static String str = "JavaPoint";
	public static class StaticDemo
	{
		public void show()
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args) 
	{
		StaticClassExample.StaticDemo obj = new StaticClassExample.StaticDemo();
		obj.show();
	}

}
