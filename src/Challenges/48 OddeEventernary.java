package Challenges;

import java.util.Scanner;

class oddeventernary {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd or even\n ");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        String result = num%2==0 ?"even":"odd";
        System.out.println("your number is " +result);
    }
}
