class jvm
{
	public static void main(String args[])
	{
		jvm obj= new jvm();
		obj=null;
		jvm a= new jvm();
		jvm b= new jvm();
		b=a;
		System.gc();
	}
	protected void finalize()throws Throwable
	{
		System.out.println("Garbage collection is performed by jvm ");
	}
}