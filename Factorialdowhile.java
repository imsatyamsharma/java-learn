import java.util.*;
class Factorialdowhile
{
	public static void main(String args[])
	{
		int n,i,r;
		r=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s1.nextInt();
		System.out.println("Factorial of given number is :");
         i=1;
         	do
			{
				r=r*i;
			
			i++;
			
		}
		while(i<=n);
		System.out.println(r);
		
	}
}