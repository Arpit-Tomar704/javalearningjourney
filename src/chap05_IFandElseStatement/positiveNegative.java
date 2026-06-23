package chap05_IFandElseStatement;

import java.util.Scanner;

public class positiveNegative { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (num > 0) {
        System.out.println(" the number is Positive");
    } else if (num < 0) {
        System.out.println(" the number is Negative");
    } else {
        System.out.println(" the number is Zero");
    }
}
}

