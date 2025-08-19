package Assessment;

import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature :");
        double temp= sc.nextDouble();
        if (temp>=100){
            System.out.println("you have a fever");
        }
        else {
            System.out.println("you don't have a fever");
        }
    }
}
