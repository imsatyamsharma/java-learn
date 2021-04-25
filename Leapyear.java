import java.util.*;
class Leapyear
{
	public static void main(String args[])
	{
	int n;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter year:");
	n=s1.nextInt();
	if(n%4==0 && n%100!=0){
		System.out.println(n+" is Leapyear");
	}
	else{
		System.out.println(n+" is not Leapyear");
	}
}
	}