import java.util.*;
class fibanocci1
{
	 static void largestfiblessthan(int n)
	{
		int a,b,c,d=0;
		a=0;
		b=1;
		c=a+b;
		while (c<n)
		{
			d=c;
			c=a+b;
			a=b;
			b=c;
			
		}	
		System.out.println(d);
	}	
 	public static void main(String args[])
 	{
 		largestfiblessthan(55);
 	}
}