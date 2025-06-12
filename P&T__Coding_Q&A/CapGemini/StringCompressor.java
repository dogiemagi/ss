package CapGemini;

import java.util.Scanner;

public class StringCompressor {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char prevChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char currChar = input.charAt(i);

            if (currChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                if (count > 1) {
                    compressed.append(count);
                }
                prevChar = currChar;
                count = 1;
            }
        }
        // Append last character and its count
        compressed.append(prevChar);
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to compress: ");
        String input = scanner.nextLine();

        String result = compressString(input);
        System.out.println(result);
    }
}

