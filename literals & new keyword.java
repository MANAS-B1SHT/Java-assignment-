
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // String using literal
    String s1 = "Hello";
    
    // String using new keyword
    String s2 = new String("World");
    
    System.out.println("String using literal: " + s1);
    System.out.println("String using new keyword: " + s2);
  }
}
