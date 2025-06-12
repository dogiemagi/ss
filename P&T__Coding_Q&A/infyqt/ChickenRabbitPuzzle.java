package infyqt;

import java.util.Scanner;

public class ChickenRabbitPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total heads:");
        int heads = sc.nextInt();

        System.out.println("Enter total legs:");
        int legs = sc.nextInt();

        // Solve equations:
        // C + R = heads
        // 2C + 4R = legs

        // From first: C = heads - R
        // Substitute in second: 2(heads - R) + 4R = legs
        // 2*heads - 2R + 4R = legs
        // 2*heads + 2R = legs
        // 2R = legs - 2*heads
        // R = (legs - 2*heads)/2

        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        if (rabbits >= 0 && chickens >= 0 && (2 * chickens + 4 * rabbits == legs)) {
            System.out.println("Number of Chickens: " + chickens);
            System.out.println("Number of Rabbits: " + rabbits);
        } else {
            System.out.println("No valid solution for given heads and legs.");
        }
    }
}
