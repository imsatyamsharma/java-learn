import java.util.*;
class Grades
{
	public static void main(String args[])
	{
		int n;
		Scanner s1= new Scanner(System.in);
		System.out.println("value of n:");
		n=s1.nextInt();
		if(n>80){
			System.out.println("Grade A");
		}
		else if(n>=60){
			System.out.println("Grade B");
		}
		else if(n>=40){
			System.out.println("Grade C");
		}
		else{
			System.out.println("Grade F");
		}
	}
}