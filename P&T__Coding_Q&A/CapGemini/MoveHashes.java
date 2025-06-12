package CapGemini;

import java.util.Scanner;

public class MoveHashes {

    public static String moveHash(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder hashes = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                hashes.append('#');
            } else {
                letters.append(ch);
            }
        }

        return hashes.append(letters).toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String result = moveHash(input);
        System.out.println(result);
    }
}

