package ACCENTURE;
import java.util.Scanner;

public class DecimalToNBase {

    public static char[] DectoNBase(int n, int num) {
        // Characters for digits beyond 9: A-Z
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Validate base
        if (n < 2 || n > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }

        // Edge case for zero
        if (num == 0) {
            return new char[]{'0'};
        }

        StringBuilder result = new StringBuilder();

        // Conversion logic
        while (num > 0) {
            int remainder = num % n;
            result.append(digits.charAt(remainder));
            num = num / n;
        }

        // Reverse the string because remainders come from last to first
        return result.reverse().toString().toCharArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for base and number
        System.out.print("Enter the base (2 to 36): ");
        int base = scanner.nextInt();

        System.out.print("Enter the decimal number: ");
        int number = scanner.nextInt();

        try {
            char[] result = DectoNBase(base, number);
            System.out.print("Output: ");
            for (char c : result) {
                System.out.print(c);
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
