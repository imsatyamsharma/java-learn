import java.util.*;
class Students
{
	int rolno;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter rolno and name of the student");
		rolno=s1.nextInt();
		s1.nextLine();
		name=s1.nextLine();
	}
}
class Sports extends Students
{
	int weightage;
	String sports;
	void getdata()
	{
		System.out.println("Enter the sports name and weightage:");
		sports=s1.nextLine();
		weightage=s1.nextInt();
	}
}
class Result extends Sports
{
	int st1,st2,total;
	void getmarks()
	{
		System.out.println("enter the marks of st1 and st2:");		
		st1=s1.nextInt();
		st2=s1.nextInt();
		total=(st1+st2+weightage);
	}
	void showall()
	{
		System.out.println("rolno ="+rolno);
		System.out.println("name="+name);
		System.out.println("marks of st1="+st1);
		System.out.println("marks of st2="+st2);
		System.out.println("total="+total);
	}
}
class Inheritance2
{
	public static void main(String args[])
	{
		Result r1=new Result();
		r1.get();
		r1.getdata();
		r1.getmarks();
		r1.showall();
	}
}