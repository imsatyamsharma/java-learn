import java.util.*;
class Students
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
		System.out.println(name+ " \t "+ rno);
	}
}
class Practicearrayofaobjets
{
	public static void main(String args[])
	{
		Student stu[]=new Student[3];
		int i;
		System.out.println("Enter record of 3 students:");
		for(i=0;i<3;i++)
		{
			stu[i]=new Student();
			System.out.println("Enter record of students: "+i);
			stu[i].getData();
		}
		System.out.println("students Details Are :");
		System.out.println("Name  \t rno ");
		for(i=0;i<3;i++)
		{
			stu[i].showData();
		}
	}
}