import java.util.*;
class Students
{
	int rollno;
	String name;
	static int count_stds;
	Scanner s1=new Scanner(System.in);
	void getdata()
	{
		System.out.println("enter rollno and the name of the students:");
		rollno=s1.nextInt();
		s1.nextLine();
		name=s1.nextLine();
		count_stds++;
	}
	static void showcount()
	{
	System.out.println("number of students in the college are ="+count_stds);
	}
	void showdata()
	{
		//System.out.println("Students details:");
		System.out.println(rollno+"\t"+name);
	}
}
	class Practicestaticstudentsvariable
	{
		public static void main(String args[])
		{
		Students s1[]=new Students[3];
		int i,n;
		System.out.println("Enter record of 3 customers:");
		for(i=0;i<3;i++)
		{
			s1[i]=new Students();
			System.out.println("Enter record of customers: "+i);
			s1[i].getdata();
		}
		System.out.println("students Details Are :");
		System.out.println("rollno  \t name");
		for(i=0;i<3;i++)
		{
			s1[i].showdata();
		}
		Students.showcount();
	}
}