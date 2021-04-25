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
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
	}
}
	class Practiceclassemp
	{
		public static void main(String args[])
	{
		Employeedetails emp=new Employeedetails();
		emp.getData();
		emp.showData(); 
	}
}