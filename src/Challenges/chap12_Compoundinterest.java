package Challenges;

import java.util.Scanner;

public class chap12_Compoundinterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Compound interest Calculator\n ");
        System.out.print("please Enter your principle amount : ");
        int principle = input.nextInt();
        System.out.print("now,tell me your rate of interest : ");
        float rate = input.nextFloat();
        System.out.print("now,tell me for how many years you borrowing this money  :");
        float years = input.nextFloat();

        double compint = principle*Math.pow((1+rate/100),years);
        System.out.print("your calculated compound interest is  rs :" +compint);

    }
}
