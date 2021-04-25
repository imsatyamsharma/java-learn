import java.util.*;
class Students
{
	int rollno;
	String name;
	Scanner s1=new Scanner(System.in);
	void getdata()
	{
		System.out.println("enter name and the rollno of the students:");
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
		System.out.println("Students details \n rollno \t name :");
		System.out.println(rollno+"\t"+name);
	}
}
	class Practicestaticstudentsvariable
	{
		public static void main(String args[])
		{
		students s1[]=new students[3];
		int i;
		System.out.println("Enter record of 3 customers:");
		for(i=0;i<3;i++)
		{
			s1[i]=new students();
			System.out.println("Enter record of customers: "+i);
			b1[i].getdata();
		}
		System.out.println("students Details Are :");
		System.out.println("rollno  \t name");
		for(i=0;i<3;i++)
		{
			b1[i].showdata();
		}
		students.showcount();
	}
}