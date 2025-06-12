package tcs;

import java.util.Scanner;

public class WashingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight of clothes (grams): ");
        int weight = scanner.nextInt();

        if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight > 0 && weight <= 2000) {
            System.out.println("Time Estimated: 25 minutes");
        } else if (weight >= 2001 && weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        } else if (weight > 4000 && weight <= 7000) {
            System.out.println("Time Estimated: 45 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

