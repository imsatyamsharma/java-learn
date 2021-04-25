import java.util.*;
class Pocker
{
		String players;
		char card;
		Scanner s1=new Scanner(System.in);
		void getdata()
	{
		System.out.println("card details of player1 :");
		card1=s1.next().charAt(0);
		System.out.println("card details of player2 :");
		card2=s1.next().charAt(0);
		System.out.println("card details of player3 :");
		card3=s1.next().charAt(0);
	}
	void showdata()
	{
		System.out.println("card details of player 1 ="+card1);
		System.out.println("card details of player 2 ="+card2);
		System.out.println("card details of player 3 ="+card3);
	}
}
	class practicepocker
	{
		public static void main(String args[])
		{
			Pocker pok=new Pocker();
			pok.getdata();
			pok.showdata();
		}
	}