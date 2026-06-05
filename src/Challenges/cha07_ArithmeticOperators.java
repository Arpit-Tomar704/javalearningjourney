package Challenges;

import java.util.Scanner;

public class cha07_ArithmeticOperators {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the arithmetic operator\n");
        System.out.print("Please Enter the first Number : ");
        int a = input.nextInt();
        System.out.print("Please Enter the second Number : ");
        int b = input.nextInt();
        int add = a +b;
        int sub = a -b ;
        int mul =a*b;
        int div = a/b;
        int mod = a %b;

        System.out.println("Your adiition is "  +add);
        System.out.println("Your Subtraction is " +sub);
        System.out.println("your Multiplication is " +mul);
        System.out.println("your divison  is " +div);
        System.out.println("your modulo is " +mod);

    }
}
