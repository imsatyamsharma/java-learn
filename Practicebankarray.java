import java.util.*;
class Bank
{
	int accno;
	double balance;
	String name;
	Scanner s1=new Scanner(System.in);
	void createAcc()
	{
		System.out.println("Enter the Accno: ");
		accno=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter Name: ");
		name=s1.nextLine();
		System.out.println("Enter Balance: ");
		balance=s1.nextInt();
	}
	void displayacc()
	{
		System.out.println(accno+ " \t "+name +" \t "+balance);
	}
}
	class Practicebankarray
{
	public static void main(String args[])
	{
		Bank b1[]=new Bank[3];
		int i;
		System.out.println("Enter record of 3 customers:");
		for(i=0;inti<3;i++)
		{
			b1[i]=new Bank();
			System.out.println("Enter record of customers: "+i);
			b1[i].createAcc();
		}
		System.out.println("customers Details Are :");
		System.out.println("accno  \t name \t balance ");
		for(i=0;i<3;i++)
		{
			b1[i].displayacc();
		}
	}
}