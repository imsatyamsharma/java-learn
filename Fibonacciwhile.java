import java.util.*;
class Fibonacciwhile
{
	public static void main(String args[])
	{
		int a,b,n,c,i;
	     a=0;
	     b=1;
	     c=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s1.nextInt();
		i=0;
		while(i<=n)
		{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print("\t" + c);
		}
		 
		
		
	}
}