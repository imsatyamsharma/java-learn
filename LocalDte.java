import java.time.Date;
import java.time.Month;
class LocalDte
{
	public static void main(String args[])
	{
	LocalDte currentdate = LocalDte.now();
	System.out.println("Current date: "+currentdate);
	int currentday=date.getDayofMonth();
	System.out.println("currentday="+currentday);
	Month currentMonth = currentdate.getMonth();
	System.out.println("currentMonth="+currentMonth);
	int currentYear= currentdate.getYear();
	System.out.println("Current month: "+currentYear);
	}
}