package cts;

import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];

        System.out.println("Enter the digits:");
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            // Cast the number to char to get the ASCII character
            char ch = (char) num;
            System.out.println(num + "-" + ch);
        }
    }
}

