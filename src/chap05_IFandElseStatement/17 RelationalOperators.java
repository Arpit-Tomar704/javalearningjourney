package chap05_IFandElseStatement;

import java.util.Scanner;

class Relational {
  static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Driving license Portal\n ");
   System.out.print("Please Enter your Age:  ");
   int age = input.nextInt();
   if (age >=18){
    System.out.println("You are Eligible for license ");
   }else {
    System.out.println("you are Not Eligibe for License and abhi cycle chaulao  ");
   }
  }
}
