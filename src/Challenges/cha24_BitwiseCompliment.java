package Challenges;

import java.util.Scanner;

public class cha24_BitwiseCompliment {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcase Bitwise Not/compliment\n");
        System.out.print("please enter your Number :  ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("your result is :" +result);


    }
}
