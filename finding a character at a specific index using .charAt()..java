
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    System.out.print("Enter the index to find character at: ");
    int index = sc.nextInt();
    
    // Finding character at specific index using charAt() method
    char character = str.charAt(index);
    System.out.println("Character at index " + index + " is: " + character);
    
  }
}
