class SimpleInterest
{
	public static void main(String args[])
	{
		//variable declare
		double a,p,r,t;
		//put the values
		p=10000;
		r=2.5;
		t=1.35;
		//put the formula
		a=(p*r*t)/100;
		//print ther value 
		System.out.println("Value of p ="+p);
		System.out.println("Value of r ="+r);
		System.out.println("Value of t ="+t);
		System.out.println("SimpleInterest of p,rand t ="+a);
	}
}