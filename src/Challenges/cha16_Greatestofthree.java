package Challenges;

import java.util.Scanner;

public class cha16_Greatestofthree {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the world of Three\n");
        System.out.print("please enter your first number A : ");
        int a = input.nextInt();
        System.out.print("now,please enter your second number b : ");
        int b= input.nextInt();
        System.out.print(" now ,finally Enter your third number c: ");
        int c = input.nextInt();
        if (a>=b&&a>=c){
            System.out.println("A is your greatest number ");
        } else if (b>=a&&b>=c) {
            System.out.println("b is your greatest number ");
        }else{
            System.out.println("c is your greatest number ");
        }
    }
}
