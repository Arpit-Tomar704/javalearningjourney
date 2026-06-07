package Challenges;

import java.util.Scanner;

public class cha21_BitwiseOR {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing BitwiseOR\n");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Now,enter the other : ");
        int second = input.nextInt();
        int result = first | second;
        System.out.println("Result is : "+result);
    }
}
