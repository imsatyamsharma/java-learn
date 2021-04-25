import java.util.*;
class Averageuserinput
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter Value of a =");
		a=s1.nextInt();
		System.out.println("Enter Value of b =");
		b=s1.nextInt();
		System.out.println("Enter Value of c =");
		c=s1.nextInt();
		d=(a+b+c)/3;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("Value of c ="+c);
		System.out.println("Average of a,b and c ="+d);

	}
}