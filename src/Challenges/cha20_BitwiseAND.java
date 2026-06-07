package Challenges;

import java.util.Scanner;

public class cha20_BitwiseAND {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwse AND Operator\n");
        System.out.print("please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now enter the other  number: ");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("Result is :" +result );
    }
}
