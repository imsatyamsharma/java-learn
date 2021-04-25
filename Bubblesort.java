//array practice
import java.util.*;
class Bubblesort
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,j,temp;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{ 
			for(j=0;j<n-i-1;j++)
			{
			   if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
	}
	System.out.print("list in sorted form is: ");
	for(i=0;i<n;i++){
	       	System.out.println(a[i]);
	       }
		
		}
		
	}

