package ACCENTURE;
import java.util.Scanner;

public class BinaryStringOperation {

    public static int OperationsBinaryString(String str) {
        // Handle null or empty string
        if (str == null || str.length() == 0) {
            return -1;
        }

        // First character must be a binary digit
        int result = str.charAt(0) - '0';

        // Loop through string, stepping by 2 (operator, then digit)
        for (int i = 1; i < str.length(); i += 2) {
            char operator = str.charAt(i);
            int nextDigit = str.charAt(i + 1) - '0';

            switch (operator) {
                case 'A':
                    result = result & nextDigit;
                    break;
                case 'B':
                    result = result | nextDigit;
                    break;
                case 'C':
                    result = result ^ nextDigit;
                    break;
                default:
                    // Invalid operator
                    return -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter binary string with operations (e.g., 1C0C1C1A0B1): ");
        String input = scanner.nextLine();

        int result = OperationsBinaryString(input);
        System.out.println("Output: " + result);
    }
}
