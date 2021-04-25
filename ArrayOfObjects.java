import java.util.*;
class Employeedetails
{
	int id,salary;
	String name;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter id of the Employee: ");
		id=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter name of the Employee: ");
		name=s1.nextLine();
		System.out.println("Enter Salary of the Employee: ");
		salary=s1.nextInt();
	}
	void showData()
	{
		System.out.println(id+" \t " +  name+" \t " +salary);
	}
}
	class ArrayOfObjects
	{
		public static void main(String args[])
	{
/*		Employeedetails emp=new Employeedetails();
		emp.getData();
		emp.showData(); */
		Employeedetails emp[]=new Employeedetails[3];
		int i;
		System.out.println("Enter record of 3 employees:");
		for(i=0;i<3;i++)
		{
			emp[i]=new Employeedetails();
			System.out.println("Enter record of EMployee: "+i);
			emp[i].getData();
		}
		System.out.println("Employee Details Are :");
		System.out.println("EID  \t NAME \t SALARY");
		for(i=0;i<3;i++)
		{
			emp[i].showData();
		}
	}
}