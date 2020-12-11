 class An1 
{
	String color = "white";
}
class dog extends An1
{
	String color = "black";
void printColor()
{
	System.out.println(color);
	System.out.println(super.color);
}
}
class Animal
{
	public static void main(String[] args) 
	{
		dog d = new dog();
		d.printColor();
	}

}
