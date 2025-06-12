package infyqt;

public class TriangleCheck {

    public static boolean canFormTriangle(int a, int b, int c) {
        // Check if any side is greater than or equal to sum of the other two
        if (a >= b + c || b >= a + c || c >= a + b) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example test
        int a = 3, b = 4, c = 5;
        if (canFormTriangle(a, b, c)) {
            System.out.println("Yes, the numbers can form a triangle.");
        } else {
            System.out.println("No, the numbers cannot form a triangle.");
        }
    }
}

