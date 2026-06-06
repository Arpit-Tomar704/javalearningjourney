package Challenges;

import java.util.Scanner;

public class cha15_oddeven {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd even calculator\n");
        System.out.print("Please enter the number:  ");
        int num = input.nextInt();
        if (num%2 ==0){
            System.out.println("your number is Even");

        }else {
            System.out.println("your number is Odd");
        }
    }
}
