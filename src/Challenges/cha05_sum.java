package Challenges;

import java.util.Scanner;

 class cha05_sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second Number : ");
        int secondNumber = input.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("The Sum of Two Nmber is : " +sum);


    }
}
