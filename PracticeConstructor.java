//program of Constructors
import java.util.*;
class Student
{
	int rno;
	String name;
	//default constructor
	Student()
	{
		System.out.println("Default constructor called: ");
		rno=0;
		name="Not Given";
	}
	//parameterized constructor
	Student(int r, String n)
	{
		System.out.println("Parameterized Constructor called: ");
		rno=r;
		name=n;
	}
	Student(Student x)
	{
		System.out.println("Copy Constructor called: ");
		rno=x.rno;
		name=x.name;
	}
	void get()
	{
		rno=1;
		name="Naveen";
	}
	void show()
	{	
		System.out.println("rno = "+rno);
		System.out.println("Name = "+name);
	}
}
class PracticeConstructor
{
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.show();
	Student s2=new Student(1,"Naveen");
	s2.show();
	Student s3=new Student(s2);
	s3.show();
	}
}
