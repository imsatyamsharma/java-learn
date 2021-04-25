import java.util.*;
class Array2d
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int i,j;
//		System.out.println("Enter the size of the array: ");
//		n=s1.nextInt();
		int mat[][]=new int[3][3];
		System.out.println("enter elements in 3*3 matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=s1.nextInt();
			}
		}
	System.out.println("elements in the Matrix are:n");
	    for(i=0;i<3;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print("\t"+mat[i][j]);
	    	}
	    System.out.println();
	    }

	}	
		}
