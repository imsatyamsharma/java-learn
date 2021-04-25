//array practice
import java.util.*;
class PracticereverseArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter "+n+" elements in the list:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println("Elements in the array in reverse are: ");
		for(i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}
}