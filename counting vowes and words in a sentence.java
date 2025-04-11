import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count vowels
        int vowelCount = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }

        // Count words
        String trimmed = sentence.trim();
        int wordCount = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;

        // Output results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
