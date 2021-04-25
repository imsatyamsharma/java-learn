import java.util.*;
class Time
{
	public static void main(String args[])
	{
		int hours,minutes,seconds,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter time in seconds:");
	    n=s1.nextInt();
		hours=n/3600;
	    n=n%3600;
		minutes=n/60;
		seconds=n%60;
		System.out.println(" time in hours ="+hours);
		System.out.println(" time in minutes ="+minutes);
		System.out.println(" time in second ="+seconds);
		
	}
}