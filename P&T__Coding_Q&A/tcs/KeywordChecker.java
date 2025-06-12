package tcs;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class KeywordChecker {

    public static void main(String[] args) {
        // Define the list of keywords using a HashSet for fast lookup
        Set<String> keywords = new HashSet<>();
        String[] keywordArray = {
            "break", "case", "continue", "default", "defer", "else",
            "for", "func", "goto", "if", "map", "range",
            "return", "struct", "type", "var"
        };

        // Add all keywords to the set
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine().trim();

        // Normalize input to lowercase
        String inputLower = input.toLowerCase();

        // Check if it's a keyword
        if (keywords.contains(inputLower)) {
            System.out.println(inputLower + " is a keyword");
        } else {
            System.out.println(inputLower + " is not a keyword");
        }
    }
}
