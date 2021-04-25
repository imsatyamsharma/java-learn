//array practice
import java.util.*;
class Linearsearch
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,item;
		System.out.println("Enter number of elements in the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
				System.out.println("Enter the element to search: ");
				item=s1.nextInt();
		for(i=0;i<n;i++)
		{ 
			if(a[i]==item)
			{
				System.out.println(item + " found and present at location: "+i);
				break;
			}
		}	
			if(i>=n)
		System.out.println(" elements not found");
		}
	}
		
	

