import java.util.*;
class Age
{
	public static void main(String args[])
	{
		int ageA, ageB, ageC;
		String a,b,c;
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);

		System.out.println("name and age of a:");
		a=s1.next();
		ageA=s1.nextInt();
		System.out.println("name and age of b:");
		b=s1.next();
		ageB=s1.nextInt();
		System.out.println("name and age of c:");
		c=s1.next();
		ageC=s1.nextInt();
		
		if(ageA>=ageB && ageB>=ageC){
			System.out.println(a+" is eldest");
		}
		else if(ageB>=ageC && ageC<=ageB){
			System.out.println(b+" is modest");
		}
		else{
			System.out.println(c+" is yougest");
		}
		
	}
}