import java.util.*;
interface Area
{
	final double pi=3.14;
	void calculatearea();
}
class Circle implements Area
{
	double radius,areaofcircle;
	Scanner s1=new Scanner(System.in);
	void getradius()
	{
		System.out.println("enter the radius of the circle:");
		radius=s1.nextDouble();
	}
	public void calculatearea()
	{
		areaofcircle=(pi*radius*radius);
		System.out.println("area of circle ="+areaofcircle);
	}
}
class Sphere implements Area
{
	double radius,areaofsphere;
	Scanner s1=new Scanner(System.in);
	void getradius()
	{
		System.out.println("enter the radius of the sphere:");
		radius=s1.nextDouble();
	}
	public void calculatearea()
	{
		areaofsphere=4/3*pi*radius*radius;
		System.out.println("area of sphere="+areaofsphere);
	}
}
class Cone implements Area
{
	double radius,areaofcone;
	Scanner s1=new Scanner(System.in);
	void getradius()
	{
		System.out.println("enter the radius of the cone:");
		radius=s1.nextDouble();
	}
	public void calculatearea()
	{
		areaofcone=1/3*pi*radius*radius;
		System.out.println("area of cone="+areaofcone);
	}
}
class Interfacepractice
{
	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.getradius();
		c1.calculatearea();
		Sphere s1=new Sphere();
		s1.getradius();
		s1.calculatearea();
		Cone e1=new Cone();
		e1.getradius();
		e1.calculatearea();
	}
}