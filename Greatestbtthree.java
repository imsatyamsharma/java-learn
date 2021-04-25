import java.util.*;
class Greatestbtthree
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1= new Scanner(System.in);
		System.out.println("value of a:");
		a=s1.nextInt();
		System.out.println("value of b:");
		b=s1.nextInt();
		System.out.println("value of c:");
		c=s1.nextInt();
		if(a>b){
			if(a>c)
			System.out.println("a is greatest");
		
		else
			System.out.println("c is greatest");
		}
		
		else if(b>c)
			System.out.println("b is greatest");
		else{
			
			System.out.println("c is greatest");
			}		

	}
}