
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    // Finding length of the string using length() method
    int length = str.length();
    System.out.println("Length of the string: " + length);
    
  }
}