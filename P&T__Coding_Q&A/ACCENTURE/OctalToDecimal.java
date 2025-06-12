package ACCENTURE;
import java.util.Scanner;

public class OctalToDecimal {

    public static int octalToDecimal(String octalStr) {
        int decimalValue = 0;
        int base = 1; // 8^0

        // Start from the rightmost digit and move left
        for (int i = octalStr.length() - 1; i >= 0; i--) {
            char ch = octalStr.charAt(i);

            // Check if the character is a valid octal digit (0–7)
            if (ch < '0' || ch > '7') {
                throw new IllegalArgumentException("Invalid octal digit: " + ch);
            }

            int digit = ch - '0';
            decimalValue += digit * base;
            base *= 8;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for octal number
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.nextLine();

        try {
            int result = octalToDecimal(octalInput);
            System.out.println("Decimal equivalent: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
