import java.util.*;
class switchgreatestn
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter two numbers a and b:");
		a=s1.nextInt();
		b=s1.nextInt();
		c=a>b?1:0;
		switch(c)
		{
			case 0:
			System.out.println("b is greatest");
			break;
			case 1:
			System.out.println("a is greatest");
			break;
			
			default:
			System.out.println("both are same");
		}
	
		
	}
}