import java.util.*;
class Areaofcircleuser
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int radius;
		double pi,result;
		System.out.println("Enter Value of radius =");
		radius=s1.nextInt();
		System.out.println("Enter Value of pi =");
		pi=s1.nextDouble();
		result=pi*radius*radius;
		System.out.println("Value of radius ="+radius);
		System.out.println("Value of pi ="+pi);
		System.out.println("Areaofcircleuser ="+result);
	}
}