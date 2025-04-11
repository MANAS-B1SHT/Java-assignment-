
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();
    
    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();
    
    // Comparing strings using equals()
    System.out.println("\nComparing strings using equals():");
    System.out.println("str1 equals str2: " + str1.equals(str2));
    
    // Comparing strings using compareTo()
    System.out.println("\nComparing strings using compareTo():");
    int comparison = str1.compareTo(str2);
    if (comparison == 0) {
        System.out.println("str1 is equal to str2");
    } else if (comparison > 0) {
        System.out.println("str1 is greater than str2");
    } else {
        System.out.println("str1 is less than str2");
    }
  }
}
