import java.util.*;
class Swappingwithoutthirdvariable
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two numbers a and b:");
		a=s1.nextInt();
		b=s1.nextInt();

		System.out.println("BEFORE SWAPPING");
		System.out.println("Value of a = "+a);                
		System.out.println("Value of b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING");
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}

}