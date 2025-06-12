package ACCENTURE;
import java.util.Scanner;

public class RatCount {

    public static int ratCountHouse(int r, int unit, int[] arr) {
        // Edge Case: Null array
        if (arr == null) {
            return -1;
        }

        // Total food required by all rats
        int totalFoodNeeded = r * unit;
        int sum = 0;

        // Traverse the array and accumulate food
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= totalFoodNeeded) {
                // Return house count (1-based index)
                return i + 1;
            }
        }

        // If food is insufficient
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rats
        System.out.print("Enter number of rats: ");
        int r = scanner.nextInt();

        // Input unit of food per rat
        System.out.print("Enter food unit per rat: ");
        int unit = scanner.nextInt();

        // Input number of houses (size of array)
        System.out.print("Enter number of houses: ");
        int n = scanner.nextInt();

        // Input food in each house
        int[] arr = new int[n];
        System.out.println("Enter food in each house:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        

        int result = ratCountHouse(r, unit, arr);
        System.out.println(result);  // Expected Output: 4
    }
}
