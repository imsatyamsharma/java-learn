import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two numbers a and b:");
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println("Press 1 for +");
		System.out.println("Press 2 for -");
		System.out.println("Press 3 for *");
		System.out.println("Press 4 for /");
		System.out.println("Press 5 for exit");
		System.out.println("Enter your choice");
		int n;
		System.out.println("Enter any number 1 to 5");
		n=s1.nextInt();
		
		switch(n)
		{
			case 1:
			c=a+b;
			System.out.println("sum of two numbers ="+c);
			break;
			case 2:
			c=a-b;
			System.out.println("subtract two numbers ="+c);
			break;
			case 3:
			c=a*b;
			System.out.println("multiply two numbers ="+c);
			break;
			case 4:
			c=a/b;
			System.out.println("devide two numbers ="+c);
			break;
			case 5:
			System.out.println("for exit");
			System.exit(0);
			default:
			System.out.println("invalid number");
		}

}
}



