package Challenges;

import java.util.Scanner;

public class cha_25RightshiftOperator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing Rightshiftoperator\n");
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int result = num >>1 ;
        System.out.println("your result is : "+result);
    }
}
