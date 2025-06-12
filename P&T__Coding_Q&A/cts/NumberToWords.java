package cts;

import java.util.Scanner;

public class NumberToWords {

    // Arrays to map numbers to words
    static String[] oneToNineteen = {
        "", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    // Method to convert 1- or 2-digit number to words
    static String convertTwoDigit(int num) {
        if (num < 20) {
            return oneToNineteen[num];
        } else {
            return tens[num / 10] + (num % 10 != 0 ? " " + oneToNineteen[num % 10] : "");
        }
    }

    // Main method to convert 4-digit number to words
    static String numberToWords(int num) {
        if (num < 1000 || num > 9999) {
            return "Invalid input. Please enter a 4-digit number.";
        }

        StringBuilder result = new StringBuilder();

        int thousands = num / 1000;
        result.append(oneToNineteen[thousands]).append(" thousand");

        int hundreds = (num % 1000) / 100;
        if (hundreds != 0) {
            result.append(" ").append(oneToNineteen[hundreds]).append(" hundred");
        }

        int lastTwo = num % 100;
        if (lastTwo != 0) {
            result.append(" ").append(convertTwoDigit(lastTwo));
        }

        return result.toString().trim();
    }

    // Main entry
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();

        String words = numberToWords(number);
        System.out.println(words);
    }
}
