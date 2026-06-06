package Challenges;

import java.util.Scanner;

public class cha14_positivenegativezero {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number identifier\n");
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        if (num>0){
            System.out.println("The given number is positive ");
        }else if (num<0){
            System.out.println("The given Number is negative ");
        }else{
            System.out.println("The given  number is zero  ");
        }
    }
}
