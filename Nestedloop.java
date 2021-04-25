import java.util.*;
class Nestedloop
{
	public static void main(String args[])
	{
		int i,j,n,r;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				r=i*j;
				System.out.print("\t"+ r);
			}
			System.out.println();
		}
	}
}