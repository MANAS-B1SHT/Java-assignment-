
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();
    
    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();
    
    // Concatenating strings using + operator
    String result1 = str1 + str2;
    System.out.println("Concatenated string using +: " + result1);
    
    // Concatenating using concat() method
    String result2 = str1.concat(str2);
    System.out.println("Concatenated string using concat(): " + result2);
    
    
  }
}
