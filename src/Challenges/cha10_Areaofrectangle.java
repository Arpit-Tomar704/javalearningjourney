package Challenges;

import java.util.Scanner;

public class cha10_Areaofrectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Area Calculator\n");
        System.out.print("Please Enter your base in cm: ");
        double base = input.nextDouble();
        System.out.print("Please Enter the Height in cm : ");
        double Height = input.nextDouble();
        System.out.println("Area of reactangle is " +(0.5*base*Height));
    }
}
