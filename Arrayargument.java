import java.util.*;
class Arrayargument
{
	public static void maxarray(int x[])
	{
		int i,max;
		max=0;
		for(i=0;i<x.length;i++)
		{ 
			if(max<x[i])
			{
				max=x[i];
			}	
		}
		System.out.println("largest number of given array ="+max);

	}
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
		public static void main(String args[])
		{int n,i,x;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of the array: ");
			n=s1.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements in the array: ");
			for(i=0;i<n;i++)
			{
				a[i]=s1.nextInt();
			}
			maxarray(a);
			//calling recursion
			int result=factorial(5);
			System.out.println("Result of the factorial = "+result);

		}
	
}