package Challenges;

import java.util.Scanner;

class Floatmultiplication {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are doing Float multiplicatio\n");
        System.out.print("Enter the first decimal  number:");
        double first = input.nextDouble();
        System.out.print("Enter the second  decimal number :");
        double second = input.nextDouble();
        System.out.println("\n Result is " +(first*second));
    }
}
