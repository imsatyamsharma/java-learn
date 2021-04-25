import java.util.*;
class Evensteven
{
	public static void main(String args[])
	{
		int a,b,c,d,e;
		System.out.println("enter three numbers a,b and c:");
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
		d=a-b;
		e=b-c;
		if(a>b && b>c)
			{
				System.out.println("a is biggest="+a);
				System.out.println("b is medium="+b);
				System.out.println("c is smallest="+c);
			}
			else if(a<b && b>c && c<a)
			{
				System.out.println("b is biggest="+b);
				System.out.println("a is medium="+a);
				System.out.println("c is smallest="+c);
			}
			else if(a<b && b<c)
			{
				System.out.println("c is biggest="+c);
				System.out.println("b is medium="+b);
				System.out.println("a is smallest="+a);
			}
			else if(a>b && b<c && a<c)
			{
				System.out.println("c is biggest="+c);
				System.out.println("a is medium="+a);
				System.out.println("b is smallest="+b);
			}
			else if(a>b && b<c)
			{
				System.out.println("a is biggest="+a);
				System.out.println("c is medium="+c);
				System.out.println("b is smallest="+b);
			}
			else
			{
				System.out.println("b is biggest="+b);
				System.out.println("c is medium="+c);
				System.out.println("a is smallest="+a);
			}
			
			if(d==e)
			{
				System.out.println("it is even");
			}
			else
			{
				System.out.println("its even steven");
			}

	}
}