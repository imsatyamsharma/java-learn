import java.util.*;
class Switchvovels
{
	public static void main(String args[])
	{
		char chr;
		Scanner s1= new Scanner(System.in);
		chr=s1.next().charAt(0);
		switch(chr)
		{
		case 'a':
		System.out.println("a is vovel");
		break;
		case 'e':
		System.out.println("e is vovel");
		break;
		case 'i':
		System.out.println("i is vovel");
		break;
		case'o':
		System.out.println("o is vovel");
		break;
		case'u':
		System.out.println("u is vovel");
		break;
		default:
		System.out.println("not a vovel");
	}
}
}