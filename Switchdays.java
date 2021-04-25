import java.util.*;
class Switchdays
{
	public static void main(String args[])
	{
		int n;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter number netween 1to 7:");
		n=s1.nextInt();
		switch(n)
		{
		case 1:
		System.out.println("first day monday");
		break;
		case 2:
		System.out.println("second day tuesday");
		break;
		case 3:
		System.out.println("third day wednesday");
		break;
		case 4:
		System.out.println("fourth day thursday");
		break;
		case 5:
		System.out.println("fifth day friday");
		break;
		case 6:
		System.out.println("sixth day saturday");
		break;
		case 7:
		System.out.println("seventh day sunday");
		break;
		default:
		System.out.println("not valid");
	}
}
}