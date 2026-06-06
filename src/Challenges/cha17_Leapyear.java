package Challenges;

import java.util.Scanner;

public class cha17_Leapyear {
    static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("welcome to the leap year calculator ");
        System.out.print("Please Enter the year you want to check : ");
        int year = input.nextInt();
//        if (year%400==0){
//            System.out.println("The year is leap year ");
//        } else if (year%100==0) {
//            System.out.println("The year is not a leap year ");
//        } else if (year%4==0) {
//            System.out.println("The year is leap year ");
//        }else {
//            System.out.println("The year is not a leap year ");
//        }
        if (year%400==0||year%4==0&& year%100 !=0){
            System.out.println("your year is a leap year ");
        }else {
            System.out.println("your year is not a leap year ");
        }
    }
}
