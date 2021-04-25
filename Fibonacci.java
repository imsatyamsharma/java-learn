import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int a,b,n,c,i;
	     a=0;
	     b=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s1.nextInt();
		for(i=0;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
	}
}