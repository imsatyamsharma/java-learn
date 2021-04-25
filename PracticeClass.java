//program to implement the concept of class and object
import java.util.*;
class Student
{
	int rno;
	String name;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter name of the student: ");
		name=s1.nextLine();
		System.out.println("Enter rno of the student: ");
		rno=s1.nextInt();
	}
	void showData()
	{
		System.out.println("Rno = "+rno);
		System.out.println("Name = "+name);
	}
}
class PracticeClass
{
	public static void main(String args[])
	{
		Student stu=new Student();
		stu.getData();
		stu.showData(); 
	}
}