package infyqt;

import java.util.Scanner;

public class BusRouteProfit {

    // Method to calculate profit for one route
    public static int calculateProfit(int distance, int passengers) {
        int fuelPricePerLitre = 70;
        int mileage = 10;
        int ticketPrice = 80;

        double fuelNeeded = (double) distance / mileage;
        double fuelCost = fuelNeeded * fuelPricePerLitre;
        double revenue = passengers * ticketPrice;
        double profit = revenue - fuelCost;

        if (profit < 0) {
            return -1;  // Loss
        } else {
            return (int) profit;  // Profit (rounded down to int)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of routes
        System.out.println("Enter number of routes:");
        int routes = sc.nextInt();

        for (int i = 1; i <= routes; i++) {
            System.out.println("Enter distance (in km) for route " + i + ":");
            int distance = sc.nextInt();

            System.out.println("Enter number of passengers for route " + i + ":");
            int passengers = sc.nextInt();

            int profit = calculateProfit(distance, passengers);
            if (profit == -1) {
                System.out.println("Route " + i + ": Loss");
            } else {
                System.out.println("Route " + i + ": Profit = Rs " + profit);
            }
        }

        sc.close();
    }
}
