//pattern of 3 loops
/*
-----1
----12
---123
--1234
-12345
*/
class NestedPattern14
{
	public static void main(String args[])
	{
		int i,j,k,l;
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
	}
}