package CapGemini;

import java.util.Scanner;

public class DealershipTyreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of dealerships
        int n = sc.nextInt();
        int totalTyres = 0;

        // Process each dealership
        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);
            totalTyres += tyres;
        }

        // Output the total number of tyres
        System.out.println(totalTyres);
    }
}

