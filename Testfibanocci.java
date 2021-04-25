import java.util.*;
class Testfibonacci
{
	static Scanner s1=new Scanner(System.in);
	public static int largestfiblessthan(int n)
	{
		int a,b,c;
		a=0;
		b=1;
		System.out.println("Enter any number:");
		n=s1.nextInt();
		for(int i=0;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
	}
}
public static void main(String args[])
	{
	int n;
	}
}