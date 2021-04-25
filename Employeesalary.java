import java.util.*;
class Employeesalary
{
	public static void main(String args[])
	{
		double bs,ha,pf,da,com,total;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Employee salary as bs:");
		bs=s1.nextDouble();
		ha=bs*10/100;
		pf=bs*20/100;
		da=bs*25/100;
		com=bs*10/100;
		total=bs+ha+da+com-pf;
		System.out.println("value of ha ="+ha);
		System.out.println("value of pf ="+pf);
		System.out.println("value of da ="+da);
		System.out.println("value of com ="+com);
		System.out.println("sum of ba,ha,pf,da and com ="+total);
	}
}