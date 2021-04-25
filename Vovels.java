import java.util.*;
class Vovels
{
	public static void main(String args[])
	{
		char n;
		n='a';
		Scanner s1= new Scanner(System.in);
		System.out.println("enter char");
		n=s1.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
			System.out.println(n+" is a Vovel");
		}
		else{
			System.out.println(n+" is not a vovel");
		}
	}
}