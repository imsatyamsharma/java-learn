import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int n,rem=0,reverse=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		n=s1.nextInt();
		for(;n!=0;)
		{
			rem=n%10;
		    reverse=reverse*10+rem;
		    n=n/10;
	    }
	    System.out.println("reverse of given number is ="+reverse);
	}		
}