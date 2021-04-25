import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n,i,r;
	     r=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s1.nextInt();
		System.out.println("Factorial of given number is :");
//		for(i=n;i>=1;i--)
		for(i=1;i<=n;i++)
		{ 
		  r=r*i;
		}
		System.out.print(r);
	}
}