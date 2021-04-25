import java.util.*;
class Evensteven1
{
	public static void main(String args[])
	{
		int i,j,temp,n,d,e;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements in the array");
		for(i=0;i<n;i++)
			{
				a[i]=s1.nextInt();
			}
		for(i=0;i<n;i++)
		{ 
		 for(j=0;j<n-i-1;j++)
			{
			   if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("biggest number  "+a[0]);
		System.out.println("medium number  "+a[1]);
		System.out.println("smallest number  "+a[2]);
		d=a[0]-a[1];
		e=a[1]-a[2];
		if(d==e)
		{
			System.out.println("it is even");
		}
		else
		{
			System.out.println("its even steven");
		}
	}
}