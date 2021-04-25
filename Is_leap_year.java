import java.util.*;
class Is_leap_year
{
	
	
		public static int is_leap_year(int n){
			boolean b1=true;
			boolean b2=false;
			if(n%4==0 && n%1000==0){
				System.out.println(n+" is a leap year"+b1);
			}
			else{
				System.out.println(n+"is not a leapyear"+b2);
			}
		}

		public static void main(String args[])
		{int n;
			Scanner s1=new Scanner (System.in);
			System.out.println("enter any year");
			n=s1.nextInt();
			is_leap_year();
		}
}




