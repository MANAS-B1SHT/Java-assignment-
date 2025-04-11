
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String userInput = sc.nextLine();
    
    // Converting to uppercase
    System.out.println("Uppercase: " + userInput.toUpperCase());
    
    // Converting to lowercase
    System.out.println("Lowercase: " + userInput.toLowerCase());
  }
}
