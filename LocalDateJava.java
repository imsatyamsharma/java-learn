import java.time.LocalDate;
import java.time.Month;
public class LocalDateJava
{
   public static void main(String args[])
    {
      LocalDate currentdate = LocalDate.now();
      System.out.println("Current date: "+currentdate);
      int currentDay = currentdate.getDayOfMonth();
      System.out.println("Current day: "+currentDay);
      Month currentMonth = currentdate.getMonth();
      System.out.println("Current month: "+currentMonth);
      int currentYear = currentdate.getYear();
      System.out.println("Current month: "+currentYear);
   }
}