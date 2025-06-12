package tcs;

import java.util.Scanner;

public class SweetSeventeen {

    public static int base17ToDecimal(String base17Str) {
        // Convert input string to uppercase to handle both cases
        base17Str = base17Str.toUpperCase();

        int decimalValue = 0;
        int base = 17;
        int power = 1; // base^0 initially

        // Process from right to left
        for (int i = base17Str.length() - 1; i >= 0; i--) {
            char ch = base17Str.charAt(i);
            int digit;

            // Convert character to corresponding digit value
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'G') { // A-G corresponds to 10–16
                digit = 10 + (ch - 'A');
            } else {
                throw new IllegalArgumentException("Invalid base-17 digit: " + ch);
            }

            decimalValue += digit * power;
            power *= base;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take base-17 number as input
        System.out.print("Enter a base-17 number (0-9, A-G): ");
        String input = scanner.nextLine();

        try {
            int result = base17ToDecimal(input);
            System.out.println("Decimal equivalent: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

