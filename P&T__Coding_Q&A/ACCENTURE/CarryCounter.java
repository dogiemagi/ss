package ACCENTURE;
import java.util.Scanner;

public class CarryCounter {

    public static int NumberOfCarries(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = NumberOfCarries(num1, num2);
        System.out.println("Number of carries: " + result);
    }
}
