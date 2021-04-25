//reading input from the user
import java.util.*; //to read the input from the user, we can use an inbuilt class Scanner, To use this class, we have to import the util package
/*followed by * for all classes in util package.
import -> keyword
java-> main pakcage
util -> sub package
 * -> represent all classes
*/
class UserInput
{
	public static void main(String args[])
	{
		//create object of Scanner class
		//scanner classname
		//s1 object
		//new -> used to allocate memory
		//system.in to read the input
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		//to read the input , we can use various inbuilt methods of scanner class
		/*
		integer ->s1.nextInt();
		float ->s1.nextFloat();
		double ->s1.nextDouble();
		char -> s1.nextLine().charAt(0);
		string -> s1.nextLine();
		*/
		System.out.println("Enter value of a =");
		a=s1.nextInt();
		System.out.println("Enter value of b =");
		b=s1.nextInt();
		c=a+b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Sum of a and b = "+c);

	}
}