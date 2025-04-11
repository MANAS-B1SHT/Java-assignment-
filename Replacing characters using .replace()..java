
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    System.out.print("Enter character to replace: ");
    char oldChar = sc.next().charAt(0);
    
    System.out.print("Enter replacement character: ");
    char newChar = sc.next().charAt(0);
    
    // Replace single character
    String replacedStr = str.replace(oldChar, newChar);
    System.out.println("After replacing '" + oldChar + "' with '" + newChar + "': " + replacedStr);
    
    sc.nextLine(); // Clear buffer
    
    System.out.print("Enter substring to replace: ");
    String oldStr = sc.nextLine();
    
    System.out.print("Enter replacement string: ");
    String newStr = sc.nextLine();
    
    // Replace substring
    String replacedSubstring = str.replace(oldStr, newStr);
    System.out.println("After replacing \"" + oldStr + "\" with \"" + newStr + "\": " + replacedSubstring);
  }
}
