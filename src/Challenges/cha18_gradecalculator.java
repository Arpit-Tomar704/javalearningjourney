package Challenges;

import java.util.Scanner;

public class cha18_gradecalculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator\n");
        System.out.print("Please enter your percentage: ");
        float percentage = input.nextFloat();
        if (percentage>=90){
            System.out.println("Congrats you got grade A");
        }else if (percentage>=75){
            System.out.println("congrats you got grade B ");
        } else if (percentage>=60) {
            System.out.println("you have got c ,work harder next time ");
            
        } else if (percentage>=30) {
            System.out.println("sorry you have failed the test,your grade is D");
            
        }
    }
}
