class Nestedprime
{
	public static void main(String args[])
	{
		int i,n,j,r,x;
		System.out.println("Prime numbers between 1 to 100 are: ");
		for(i=1;i<100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{ 
			   	break;
				}
			}
			if(i==j)
				System.out.print("\t"+i);					
		}

	}
}