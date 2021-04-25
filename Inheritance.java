import java.util.*;
 class Student
{
	int rono;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	 System.out.println("Enter the rono and name of the student");
	 rono=s1.nextInt();
	 s1.nextLine();
	 name=s1.nextLine();
	}
}
class Result extends Student
{ 
	int st1,st2,total;
	void getmarks()
	{
		System.out.println("marks of two students:");
		st1=s1.nextInt();
		st2=s1.nextInt();
		total=st1+st2;
	}
	void show()
	{
		System.out.println("rono of students ="+rono);
		System.out.println("name of students="+name);
		System.out.println("marks of st1="+st1);
		System.out.println("marks of st2="+st2);
		System.out.println("total="+total);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Result r1=new Result();
		r1.get();
		r1.getmarks();
		r1.show();
	}
}