//array practice
import java.util.*;
class PracticesumArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,avg;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		int s=0;
		for(i=0;i<n;i++)
		{
			s=(s+a[i]);
			
		}
		System.out.println("sum of array elements ="+s);
		avg=s/n;
		System.out.println("average of array elements ="+avg);

	}
}