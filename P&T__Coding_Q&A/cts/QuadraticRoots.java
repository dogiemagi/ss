package cts;

import java.util.Scanner;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, and c: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid");
            return;
        }
        double a = sc.nextDouble();
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid");
            return;
        }
        double b = sc.nextDouble();
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid");
            return;
        }
        double c = sc.nextDouble();

        // Check if 'a' is zero => not quadratic
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Real and different roots
            System.out.println("RD");
        } else if (discriminant == 0) {
            // Real and same roots
            System.out.println("RS");
        } else if (discriminant < 0) {
            // Complex roots
            System.out.println("RC");
        } else {
            // Any other case, though theoretically impossible here
            System.out.println("Invalid");
        }
    }
}
