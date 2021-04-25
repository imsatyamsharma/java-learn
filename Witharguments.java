import java.util.*;
class Witharguments
{
	public static void si(int p,int r,int t)
	{
		int si;
		si=(p*r*t)/100;
		System.out.println("simple interest ="+si);
	}
	public static void Factorial(int n)
	{
		int i,r;
		r=1;
		for(i=1;i<=n;i++)
		{
			r=r*i;
		}
		System.out.println("Factorial of given number is ="+r);
	}
	public static int add(int x ,int y)
	{
//		int z;
//		z=x+y;
//		return z;
		return(x+y);
	}
		public static void main(String args[])
		{
			int n,p,r,t;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter three numbers:");
			p=s1.nextInt();
			r=s1.nextInt();
			t=s1.nextInt();
			si(p,r,t);

			System.out.println("Enter any number:");
			n=s1.nextInt();
			Factorial(n);
		//	int c=add(11,22);
		//	System.out.println("Sum of 2 numbers = "+c);
			System.out.println("Sum of 2 numbers = "+add(23,43));
				
		}
	
}