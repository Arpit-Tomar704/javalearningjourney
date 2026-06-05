package Challenges;

import java.util.Scanner;

public class cha11_Simpleinterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple interest calculator\n");
        System.out.print("Please enter your principal amount : ");
        int principle = input.nextInt();
        System.out.print("now,please tell me your rate of interest : ");
        float rate = input.nextFloat();
        System.out.print("now,tell me for how many years are you borrowed for : ");
        float years= input.nextFloat();
        System.out.println("Your Total Simple interest is:  "+ (principle*rate*years/100));
    }
}
