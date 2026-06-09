package Challenges;

import java.util.Scanner;

public class cha26_OddEvenBitwise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Even Calculator\n");
        System.out.println("Please enter your Number : ");
        int num = input.nextInt();
        if ((num&1)==1){
            System.out.print("Your Number is Odd ");
        }else {
            System.out.println("Your Number is even ");
        }

    }


}
