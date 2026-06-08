package Challenges;

import java.util.Scanner;

public class cha22_BitwiseXOR {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing BitwiseXOR\n");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Now,enter the other : ");
        int second = input.nextInt();
        int result = first ^ second;
        System.out.println("Result is : "+result);
    }
}
