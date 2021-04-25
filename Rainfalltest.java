import java.util.*;
class Rainfalltest
{
	static Scanner s1=new Scanner(System.in);
	static double a[]=new double[12];
	static String month[]={"Jan","Feb","March","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	public static void Readrainfall()
	{  
		int i;
		System.out.println("Read the rainfall for 12 months:");

			for(i=0;i<12;i++)
			{
				while(true)
				{
				System.out.print("Enter rainfall in mm for "+month[i]);
				a[i]=s1.nextDouble();
				if(a[i]<0)
				{
					System.out.println("invalid number");
				}
				else
					break;
				}
			}
	}
	public static void Displayrainfall()
	{
		int i;
		System.out.println("Display the rainfall for 12 months:");
		System.out.println("Month \t Rainfall in MM");
			for(i=0;i<12;i++)
			{
				System.out.println(month[i]+"\t"+a[i]);
			}
	}
	public static void Totalaverage()
	{ 
		int i;
		double result;
		result=0;
		for(i=0;i<12;i++)
		{
			result=result+a[i];

		}
		System.out.println("Total rainfall ="+result);
		System.out.println("average rainfall ="+result/12);
	}
	public static void Mostrainfall()
	{
		int i,index=0;
		double max;
		max=0;
		for(i=0;i<12;i++)
		{ 
			if(max<a[i])
			{
				max=a[i];
				index=i;
			}	
		}

		System.out.println("Month with the most rainfall :"+max +" ocuured in :"+month[index]);
	}
	public static void Minimumrainfall()
	{  int i,index=0;
		double min;
		min=a[0];
		for(i=0;i<12;i++)
		{ 
			if(min>a[i])
			{
				min=a[i];
				index=i;
			}
			
		}
		System.out.println("Month with the least rainfall :"+min+" ocuured in :"+month[index]);
	}
	public static void Rainfallsorting()
	{ int i,j;
		double temp;
		String tempmonth;
		for(i=0;i<12;i++)
		{ 
			for(j=0;j<12-i-1;j++)
			{
			   if(a[j]>a[j+1])
			{
				//swapping of rainfall values.
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;

				//swapping of month values
				tempmonth=month[j];
				month[j]=month[j+1];
				month[j+1]=tempmonth;
			}
		}
	}
	System.out.println("rainfall in sorted form is");
	for(i=0;i<12;i++){
	       	System.out.println("\n"+ a[i]+"\t"+month[i]); 
	       }
	}
	public static void Rainfallsearch()
	{
	 	int i;
		double item;
		System.out.println("Enter the rainfall amount to search: ");
		item=s1.nextDouble();
		for(i=0;i<12;i++)
		{ 
			if(a[i]==item)
			{
				System.out.println(item + " amount rainfall occured in month: "+month[i]);
				break;
			}
		}	
		if(i>=12)
			System.out.println(" Such amount of rainfall never occured: ");
	}
	public static void main(String args[])
	{
		int n;
		while(true){
			System.out.println("press 1 for Read the rainfall for 12 months");
			System.out.println("press 2 for Display the rainfall for 12 months");
			System.out.println("press 3 for Display the total rainfall and the average monthly rainfall");
			System.out.println("press 4 for Display the month with the most rainfall");
			System.out.println("press 5 for Display the month with the least rainfall");
			System.out.println("press 6 for Sort the rainfall in ascending order");
			System.out.println("press 7 for Search and display the month which has rainfall equal to the given rainfall");
			System.out.println("press 8 for exit");
			System.out.println("Enter Your Choice ");
			n=s1.nextInt();
			switch(n)
			{
				case 1:
				Readrainfall();
				break;
				case 2:
				Displayrainfall();
				break;
				case 3:
				Totalaverage();
				break;
				case 4:
				Mostrainfall();
				break;
				case 5:
				Minimumrainfall();
				break;
				case 6:
				Rainfallsorting();
				break;
				case 7:
				Rainfallsearch();
				break;
				case 8:
				System.out.println("Thank you for using our program");
				System.exit(0);
				default:
				System.out.println("Invalid Choice. Try Again : ");
			}
		}
	}
}