import java.util.*;
class Array2dsum
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int i,j,n,m;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		m=s1.nextInt();
		int mat[][]=new int[n][m];
		System.out.println("enter elements in n*m matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				mat[i][j]=s1.nextInt();
			}
		}
		System.out.println("elements in n*m matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			 System.out.println();
		}
	System.out.println("Transpose of the Matrix are:");
	    for(j=0;j<m;j++)
	    {
	    	for(i=0;i<n;i++)
	    	{
	    		System.out.print("\t"+mat[i][j]);
	    	}
	    System.out.println();
	    }

	}	
		}
