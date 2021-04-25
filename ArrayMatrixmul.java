import java.util.*;
class ArrayMatrixmul
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int i,j;
		int mat1[][]=new int[3][3];
		System.out.println("enter elements in n*m matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=s1.nextInt();
			}
		}
	System.out.println("elements in the Matrix are:");
	    for(i=0;i<3;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print("\t"+mat1[i][j]);
	    	}
	    System.out.println();
	    }
	    int mat2[][]=new int[3][3];
	    System.out.println("enter the element in n*m matrix");
        for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat2[i][j]=s1.nextInt();
			}
		}
	System.out.println("elements in the Matrix are:");
	    for(i=0;i<3;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print("\t"+mat2[i][j]);
	    	}
	    System.out.println();
	}
	    int mat3[][]=new int[3][3];
	    System.out.println("Multiplication of 2 matrices are: ");
        for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
						mat3[i][j]+=mat1[i][k]*mat2[k][j];
				}
				System.out.print("\t"+mat3[i][j]);
	    	}
	    	System.out.println();
		}
	}
}
