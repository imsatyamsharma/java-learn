import java.util.*;
class Days
{
	public static void main(String args[])
	{
		int years,months,weeks,days,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number of days:");
	    n=s1.nextInt();
		years=n/365;
	    n=n%365;
		months=n/30;
		n=n%30;
		weeks=n/7;
		days=n%7;
		System.out.println("no of years ="+years);
		System.out.println("no of months ="+months);
		System.out.println("no of weeks ="+weeks);
		System.out.println("no of days  ="+days);
		
	}
}