import java.util.*;
class Bank
{
	int accno;
	double balance,totalbalance;
	String name;
	static double count_interest;
	Scanner s1=new Scanner(System.in);
	void createAcc()
	{
		System.out.println("Enter the Accno: ");
		accno=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter Name: ");
		name=s1.nextLine();
		System.out.println("Enter Balance: ");
		balance=s1.nextInt();
		count_interest=4.0;
		totalbalance=balance+(balance*count_interest/100);
		
							System.out.println("totalbalance="+totalbalance);
	}
	void displayacc()
	{
		System.out.println(accno+ " \t "+name +" \t "+balance);
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
	class PracticeBank
	{
		public static void main(String args[])
		{
			Bank b1[]=new Bank[1000];
			int count=0;
			int i;
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
					System.out.println("accno  \t name \t balance ");
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
							System.out.println("accno  \t name \t totalbalance ");
							b1[i].displayacc();
							break;
						}
					}	
					if(i>=count)
						System.out.println("accno not found");
					break;
					case 4:


					//case 3:b1.deposite();
					//break;
					//case 4:b1.withdrawal();
					//break;
					//default:
					
				}
			} 
		}
	}