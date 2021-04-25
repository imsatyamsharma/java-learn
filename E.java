import java.util.*;
class Edetails
{
	public static void main(String args[])
	{
		int empid;
		String name,address;
		double salary;
		char gender;
		boolean maritalstatus;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter employee id:");
		empid=s1.nextInt();
		s1.nextLine();
		System.out.println("enter name:");
		name=s1.nextLine();
		System.out.println("enter address:");
		address=s1.nextLine();
		System.out.println("enter gender:");
		gender=s1.nextLine().charAt(0);
		System.out.println("enter maritalstatus:");
		maritalstatus=s1.nextBoolean();
		// System.out.println("enter employee id ="+empid);
		// System.out.println("enter name ="+name);
		// System.out.println("enter address ="+address);
		// System.out.println("enter gender ="+gender);
		// System.out.println("enter maritalstatus ="+maritalstatus);
		System.out.println("\n Empid \t Name \t Address \t Salary");
		System.out.println("\n" + empid + "\t" + name);

	}
}