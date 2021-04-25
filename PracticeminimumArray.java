//array practice
import java.util.*;
class PracticeminimumArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,min;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		min=a[0];
		for(i=0;i<n;i++)
		{ 
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(" smallest number of given array elements ="+min);
		}
		
	}

