import java.util.*;
class Fibonaccidowhile
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
		do
		{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print("\t" + c);
		}
		 while(i<=n);
		
		
	}
}