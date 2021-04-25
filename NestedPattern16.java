class NestedPattern16
{
	public static void main(String args[])
	{
		int i,m,n,o;
		for(i=4;i>=1;i--)
		{
			for(m=4;m>=i;m--)
			{
				System.out.print(" ");
			}
			for(n=1;n<=i;n++)
			{
				System.out.print(n);
			}
			for(o=i-1;o>=1;o--)
			{
				System.out.print(o);
			}
			System.out.println();
		}
	}
  }