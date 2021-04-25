class NestedPattern15
{
	public static void main(String args[])
	{
		int i,j,k,l,m,n,o;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--) 

			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		    for(i=4;i>=1;i--)
		{
			for(m=5;m>=i;m--)
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