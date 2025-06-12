package cts;

import java.util.Scanner;

public class LuckyCarNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit car number: ");
        int number = sc.nextInt();

        // Validate input: must be 4-digit and positive
        if (number < 1000 || number > 9999) {
            System.out.println("The number is not a valid car number");
            return;
        }

        // Calculate the sum of digits
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if sum is divisible by 3, 5, or 7
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
            System.out.println("LUCKY");
        } else {
            System.out.println("NOT_LUCKY");
        }
    }
}
