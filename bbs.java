public class bbs
	{
		public static void main(String[]args)
		{
			int []a={10,23,45,95,21,2,12,12,41,5};
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Printing shored list");
			for(int i=0;i<10;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
			