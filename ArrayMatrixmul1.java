import java.util.*;
class ArrayMatrixmul1
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int i,j,n,m;
		System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		m=s1.nextInt();
		int mat1[][]=new int[n][m];
		System.out.println("enter elements in n*m matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				mat1[i][j]=s1.nextInt();
			}
		}
	System.out.println("elements in the Matrix are:");
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<m;j++)
	    	{
	    		System.out.print("\t"+mat1[i][j]);
	    	}
	    System.out.println();
	    }
	    System.out.println("Enter the size of the array: ");
		n=s1.nextInt();
		m=s1.nextInt();
	    int mat2[][]=new int[n][m];
	    System.out.println("enter the element in n*m matrix");
        for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				mat2[i][j]=s1.nextInt();
			}
		}
	System.out.println("elements in the Matrix are:");
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<m;j++)
	    	{
	    		System.out.print("\t"+mat2[i][j]);
	    	}
	    System.out.println();
	}
	
		System.out.print("not valid Matrix");
	    int mat3[][]=new int[n][m];
	    System.out.println("Multiplication of 2 matrices are: ");
        for(i=0;i<n;i++)
		{ 
			for(j=0;j<m;j++)
			{
				for(int k=0;k<n;k++)
				{
						mat3[i][j]+=mat1[i][k]*mat2[k][j];
				}
				System.out.print("\t"+mat3[i][j]);
	    	}
	    	System.out.println();
		}
	}
}
