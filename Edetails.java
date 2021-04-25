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
		System.out.println("enter salary:");
		salary=s1.nextDouble();
		System.out.println("enter gender:");
		s1.nextline();
		gender=s1.nextline().charAt(0);
		System.out.println("enter maritalstatus:");
		maritalstatus=s1.nextBoolean();
		// System.out.println("enter employee id ="+empid);
		// System.out.println("enter name ="+name);
		// System.out.println("enter address ="+address);
		// System.out.println("enter gender ="+gender);
		// System.out.println("enter maritalstatus ="+maritalstatus);
		System.out.println("Empid \t Name \t Address \t Salary \t Gender \t maritalstatus");
		System.out.println( empid + "\t" + name + "\t" + address + "\t\t" + salary + "\t\t" + gender + "\t\t" + maritalstatus);

	}
}