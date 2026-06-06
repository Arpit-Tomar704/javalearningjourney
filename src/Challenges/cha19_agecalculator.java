package Challenges;

import java.util.Scanner;

public class cha19_agecalculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age calculator\n");
        System.out.print("please enter your age: ");
        int age = input.nextInt();
        if (age >= 60) {
            System.out.println("you are a senior citizen");
        } else if (age >= 20) {
            System.out.println("you are an  adult");
        } else if (age >= 13) {
            System.out.println("you are a Teenager ");
        }else{
            System.out.println("you are a child ");
        }

        }
    }





