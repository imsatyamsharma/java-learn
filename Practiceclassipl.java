import java.util.*;
class cricket
{
	int auctionprice;
	String teamname,Playername;
	Scanner s1=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter Auctionprice of the Player: ");
		auctionprice=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter playername: ");
		Playername=s1.nextLine();
		System.out.println("Enter Teamname: ");
		teamname=s1.nextLine();
	}
	void showData()
	{
		System.out.println("Auctionprice = "+auctionprice);
		System.out.println("Playername = "+Playername);
		System.out.println("Teamname = "+teamname);
	}
}
	class Practiceclassipl
	{
		public static void main(String args[])
	{
		cricket crk=new cricket();
		crk.getdata();
		crk.showData(); 
	}
}