import java.util.*;
class Bank
{	int accno;
	double balance,totalbalance;
	String name;
	static double count_interest;
	Scanner s1=new Scanner(System.in);
	void createAcc()
	{
		Random random=new Random();
		accno=random.nextInt(100-10)+10;
		//System.out.println("");
		//accno=s1.nextInt();
		//for random numbers
		//s1.nextLine();
		System.out.println("Enter accno ="+accno);
		System.out.println("Enter name and  Balance:");
		name=s1.nextLine();
		balance=s1.nextDouble();
		count_interest=4.0;
		totalbalance=balance+(balance*count_interest/100);
		System.out.println("totalbalance="+totalbalance);
	}
	Bank()
	{
		accno=0;
		name="not given";
		count_interest=0;
		totalbalance=0;
	}
	Bank(int a,String b,double c,int d )
	{
		accno=a;
		name=b;
		count_interest=c;
		totalbalance=d;
	}
	void displayacc()
	{
		totalbalance=balance+(balance*count_interest/100);
		System.out.println(accno+ " \t "+name+" \t "+count_interest+ " \t "+totalbalance );
	}
	void deposite()
	{
		int n;
	System.out.println("enter amount to be deposited");
	n=s1.nextInt();
	balance=balance+n;
	System.out.println("balance="+balance);
	}
	void withdrawal()
	{
		int n;
		System.out.println("enter amount to be withdrawal");
		n=s1.nextInt();
		balance=balance-n;
		System.out.println("balance="+balance);
	}	
}
	class PracticeBank1
	{
		public static void main(String args[])
		{
			Bank b1[]=new Bank[1000];
			int count=0;
			int i;
			Bank b2 =new Bank();
			b2.displayacc();
			Bank b3=new Bank(12,"sam",4.0,4000);
			b3.displayacc();
		//	b1.createAcc();
		//	b1.displayacc();
		//	b1.deposite();
		//	b1.withdrawal();
		//}
		int n,item;
		Scanner s1=new Scanner(System.in);
			while (true)
			{
				System.out.println("Press 1 for createAcc:");
				System.out.println("Press 2 for displayacc");
				System.out.println("Press 3 for display individual acc");
				System.out.println("Press 4 for deposite ");
				System.out.println("Press 5 for withrawal ");
				System.out.println("Press 6 for exit ");
				System.out.println("enter your choice");
				n=s1.nextInt();
				switch(n)
				{
					case 1:b1[count]=new Bank();
					b1[count].createAcc();
					count++;
					break;
					case 2:
					System.out.println("customers Details Are :");
					System.out.println("accno  \t name \t interestrate \t totalbalance ");
					for(i=0;i<count;i++)
					{
						b1[i].displayacc();
					}
					break;
				case 3:
					System.out.println("enter your accno:");
					item=s1.nextInt();
					for(i=0;i<count;i++)
					{ 
						if(b1[i].accno==item)
						{
							System.out.println(item + "accno found");
							System.out.println("accno  \t name \t interestrate \t totalbalance ");
							b1[i].displayacc();
							break;
						}
					}	
					if(i>=count)
						System.out.println("accno not found");
					break;
				case 4:
					System.out.println("enter your accno:");
					item=s1.nextInt();
					for(i=0;i<count;i++)
					{ 
						if(b1[i].accno==item)
						{
							b1[i].deposite();
						}
					}
					break;
					case 5:
					System.out.println("enter your accno:");
					item=s1.nextInt();
					for(i=0;i<count;i++)
					{ 
						if(b1[i].accno==item)
						{
							b1[i].withdrawal();
						}
					}

				case 6:
					System.out.println("Thank You For Using My Software: ");
					System.exit(0);
				default:
					System.out.println("INVALID CHOICE... TRY AGAIN");
				}
			} 
		}
	}
	