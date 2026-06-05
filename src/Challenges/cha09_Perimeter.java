package Challenges;

import java.util.Scanner;

public class cha09_Perimeter {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the perimeter Calculator\n ");
        System.out.print("Please enter the all four side in cms : ");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
        System.out.println("Perimeter of rectangle is " +(a+b+c+d));
    }
}
