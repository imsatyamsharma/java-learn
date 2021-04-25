//array practice
import java.util.*;
class Binarysearch
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,beg,mid,end,item;
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
				beg=0;
				end=n-1;
		while(beg<=end)
		{
			mid=(beg+end)/2;
			if(a[mid]==item)
			{
				System.out.println(item + " found and present at location: "+mid);
				break;
			}	
			else if(a[mid]<item)
				beg=(mid+1);
			else 
				end=(mid-1);
		}
		if(beg>end)
		System.out.println(" elements not found");
		}
	}
		
	

