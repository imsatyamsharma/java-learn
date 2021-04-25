import java.util.*;
class Greatest
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a:");
		a=s1.nextInt();
		System.out.println("enter value of b:");
		b=s1.nextInt();
		c=a>b?a:b;
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
		System.out.println("greatest ="+c);	
	}

}