package Assessment;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i= sc.nextInt();
        if (i>0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }

    }
}