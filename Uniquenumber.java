import java.util.*;
class Uniquenumber
{
	public static void main(String args[])
	{
		int i,n,j,k,l;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements in the array");
		for(i=0;i<n;i++)
			{
				a[i]=s1.nextInt();
			}
			System.out.println("unique number of the given series:");
			
				for(j=1;j<n;j++)
				{ 
					for(k=1;k<n;k++)
					{
						for(l=1;l<n;l++)
						{
							if(j!=k && k!=l && l!=j)
							{
							System.out.println(j+""+k+""+l);
							}
						}
					}
				}
			
	}	
}