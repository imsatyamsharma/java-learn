import java.util.*;
class Allfunctions
{
	static Scanner s1=new Scanner(System.in);
	public static void table(int n)
	{
		int r;
		for(int i=1;i<=10;i++){
		r=n*i;
		System.out.println(n+ "*"+i+ "="+r);
	}
}
	public static int factorial(int n)
	{
		int r;
		r=1;
		for(int i=1;i<=n;i++)
		{
			r=r*i;
		}
			return(r);
		
	}
	public static void fibnoci()
	{int a,b,c,n;
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
	public static void prime()
	{int n;
		System.out.println("Enter any number:");
		n=s1.nextInt();
		int x=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			    x=0;		
			    System.out.println("not a prime number");	    
	    		break; 
	    	}
	    }
	    if(x==1){
	    	 System.out.println("is prime number");
	    }

	}
	public static void main(String args[])
	{
		int i,n,r,x;
		while(true)
		{
			System.out.println("Press 1 for table:");
			System.out.println("Press 2 for factorial");
			System.out.println("Press 3 for fibnoci");
			System.out.println("Press 4 for prime ");
			System.out.println("Press 5 for Exit ");
			System.out.println("Enter Your Choice ");
			n=s1.nextInt();
			switch(n)
			{ case 1:
				System.out.println("Enter any number");
				x=s1.nextInt();
				table(x);
				break;
				case 2:
				System.out.println("Enter any number:");
				r=s1.nextInt();
				int result=factorial(r);
				System.out.println(result);
				break;
				case 3:fibnoci();
				break;
				case 4:prime();
				break;
				case 5:
					System.exit(0);
				default:
						System.out.println("Invalid Choice. Try Again : ");
			}
		}
	}
}