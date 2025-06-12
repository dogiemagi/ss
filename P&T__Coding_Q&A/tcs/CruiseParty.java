package tcs;
import java.util.Scanner;

public class CruiseParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of hours T
        System.out.print("Enter number of hours (T): ");
        int T = scanner.nextInt();

        if (T < 1 || T > 25) {
            System.out.println("Invalid input for T. Must be between 1 and 25.");
            return;
        }

        int[] entry = new int[T];
        int[] exit = new int[T];

        // Read entry values
        System.out.println("Enter " + T + " entry values (each on new line):");
        for (int i = 0; i < T; i++) {
            entry[i] = scanner.nextInt();
            if (entry[i] < 0 || entry[i] > 500) {
                System.out.println("Invalid entry value at hour " + (i+1));
                return;
            }
        }

        // Read exit values
        System.out.println("Enter " + T + " exit values (each on new line):");
        for (int i = 0; i < T; i++) {
            exit[i] = scanner.nextInt();
            if (exit[i] < 0 || exit[i] > 500) {
                System.out.println("Invalid exit value at hour " + (i+1));
                return;
            }
        }

        int currentGuests = 0;
        int maxGuests = 0;

        for (int i = 0; i < T; i++) {
            currentGuests = currentGuests + entry[i] - exit[i];
            if (currentGuests < 0) currentGuests = 0; // guests cannot be negative
            if (currentGuests > maxGuests) maxGuests = currentGuests;
        }

        System.out.println(maxGuests);
    }
}
