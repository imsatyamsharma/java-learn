import java.util.*;
class Evenodd
{
	public static void main(String args[])
	{
	int n;
	Scanner s1=new Scanner(System.in);
	System.out.println("value of n:");
	n=s1.nextInt();
	if(n%2==0){
		System.out.println(n+" is even number");
	}
	else{
		System.out.println(n+" is odd number");
	}
}
	}