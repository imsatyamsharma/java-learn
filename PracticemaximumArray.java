//array practice
import java.util.*;
class PracticemaximumArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,max;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		max=0;
		for(i=0;i<n;i++)
		{ 
			if(max<a[i])
			{
				max=a[i];
			}	
		}
		System.out.println(" largest number of given array elements ="+max);
		}
		
	}

