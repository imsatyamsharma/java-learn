import java.io.FileWriter ;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class CreateEmployeeFile {
  public static void main(String[] args) {
    try {
      FileWriter  myObj = new FileWriter ("Employeefile.txt");
        int rno,salary;
        String name;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter name,id and salary of the employee: ");
        name=s1.nextLine();
        rno=s1.nextInt();
        salary=s1.nextInt();
        myObj.write(name + "\n"+ rno +"\n"+salary);
        myObj.close();

        // to read the data from the file.
        public class Readfile{
         File myObj = new File("Employeefile.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) 
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      }
    //to read the file...

  }
}