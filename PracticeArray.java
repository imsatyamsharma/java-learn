//array practice
import java.util.*;
class PracticeArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
			sum=sum+a[i];
		//}
		//System.out.println("Elements in the array are: ");
		//for(i=0;i<n;i++)
		//{
			//System.out.println("sum of the array elements are ="+sum);
		}
			System.out.println("sum of the array elements are ="+sum);
	}
}