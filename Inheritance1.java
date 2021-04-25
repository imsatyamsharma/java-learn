import java.util.*;
class Employee
{
	int id;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("Enter the name and Id of the employee:");
	name=s1.nextLine();
	id=s1.nextInt();
	}
}
class Attendence extends Employee
{
	int salary_per_day,no_of_days,present_days;
	double commision,total;
	void getdata()
	{
		System.out.println("Enter salary_per_day and no_of_days and present_days and commision ");
		salary_per_day=s1.nextInt();
		no_of_days=s1.nextInt();
		present_days=s1.nextInt();
		commision=s1.nextDouble();
		total=(salary_per_day*present_days*commision/100);
	}
	void show()
	{
		System.out.println("salary_per_day="+salary_per_day);
		System.out.println("no_of_days="+no_of_days);
		System.out.println("commision="+commision);
		System.out.println("total="+total);
	}
}
class Inheritance1
{
	public static void main(String args[])
	{
		Attendence a1=new Attendence();
		a1.get();
		a1.getdata();
		a1.show();
	}
}