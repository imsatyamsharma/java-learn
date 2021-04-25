import java.util.*;
class Primenumber
{
	public static void main(String args[])
	{
		int i,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=s1.nextInt();
		int x=1;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
			    x=0;			    System.out.println("not a prime number");
	    		break;
	    	}
	    }
//	    if(n==i)
	    if(x==1)
	   System.out.println("is prime number");

	}
}