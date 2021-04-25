import java.util.*;
class Table
{
	public static void main(String args[])
	{
		int i,n,r;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number :");
		n=s1.nextInt();
		System.out.println("table of given number:");
		for(i=1;i<=10;i++)
		{
			r=n*i;
			System.out.println(n+ "*"+i+ "="+r);
		}

	}
}