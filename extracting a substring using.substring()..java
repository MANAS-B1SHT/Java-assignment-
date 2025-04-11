
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    System.out.print("Enter start index for substring: ");
    int startIndex = sc.nextInt();
    
    System.out.print("Enter end index for substring: ");
    int endIndex = sc.nextInt();
    
    // Substring from start index to end
    if (startIndex >= 0 && startIndex < str.length()) {
        String subStr1 = str.substring(startIndex);
        System.out.println("Substring from index " + startIndex + ": " + subStr1);
    }
    
    // Substring from start index to end index
    if (startIndex >= 0 && endIndex <= str.length() && startIndex < endIndex) {
        String subStr2 = str.substring(startIndex, endIndex);
        System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + subStr2);
    }
  }
}
