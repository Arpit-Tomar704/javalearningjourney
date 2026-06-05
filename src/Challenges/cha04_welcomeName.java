package Challenges;

import java.util.Scanner;

class cha04_welcomeName {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the coding wolrd ");
        System.out.print("enter your name : ");
        String  name = input.nextLine();
        System.out.println("welcome " + name+" to the coding world");

    }
}
