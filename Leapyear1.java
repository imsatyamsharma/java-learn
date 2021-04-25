import java.util.*;
class Leapyear1
{
		public static boolean is_leap_year(int n){
			boolean b1=true;
			boolean b2=false;
			if(n%4==0)
			{
				if(n%100==0)
				{
					if(n%1000==0)
					{
						return(b1);
					}
					else
						return(b2);	
				}
				else
					return (b1);
			}
			else
				return(b2);
		}
		public static void main(String args[])
		{
			int n;
			Scanner s1=new Scanner (System.in);
			System.out.println("enter any year to find is leapyear or not");
			n=s1.nextInt();
			boolean test = is_leap_year(n);
			System.out.println(test);
		}
}