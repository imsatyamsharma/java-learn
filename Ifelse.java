import java.util.*;
class Ifelse
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("value of a:");
		a=s1.nextInt();
		System.out.println("value of b:");
        b=s1.nextInt();
        if(a>b){
        	System.out.println(a+" is great");
        }
        else{
        	System.out.println(b+"is great");
        }
	}
}
