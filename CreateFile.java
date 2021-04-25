import java.io.FileWriter ;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class CreateFile {
  public static void main(String[] args) {
    try {
      FileWriter  myObj = new FileWriter ("Testfile.txt");
      //if (myObj.createNewFile()) {
//        System.out.println("File created: " + myObj.getName());
        int rno;
        String name;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter name and rno: ");
        name=s1.nextLine();
        rno=s1.nextInt();
        myObj.write(name + "\n"+ rno);
        myObj.close();
     // } else {
       // System.out.println("File already exists.");
      //}
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}