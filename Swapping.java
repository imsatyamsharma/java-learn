import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 2 numbers a and b: ");
		a=s1.nextInt();
		b=s1.nextInt();

		System.out.println("BEFORE SWAPPING");
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("AFTER SWAPPING");
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		

	}
}