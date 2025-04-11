
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    System.out.print("Enter a character to find: ");
    char searchChar = sc.next().charAt(0);
    
    // Finding first occurrence using indexOf()
    int firstIndex = str.indexOf(searchChar);
    System.out.println("First occurrence of '" + searchChar + "' is at index: " + firstIndex);
    
    // Finding last occurrence using lastIndexOf()
    int lastIndex = str.lastIndexOf(searchChar);
    System.out.println("Last occurrence of '" + searchChar + "' is at index: " + lastIndex);
    
    // Demonstration of substring
    if (firstIndex != -1) {
      String subStr = str.substring(firstIndex);
      System.out.println("Substring from first occurrence: " + subStr);
    }
  }
}
