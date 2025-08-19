package Assessment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        System.out.println("Enter numbers (enter 0 to stop):");
        while (true) {
            int num = sc.nextInt();
            // Stop when user enters 0
            if (num == 0) {
                break;
            }

            // Check even or odd
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        // Print results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}