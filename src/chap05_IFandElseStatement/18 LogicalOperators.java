package chap05_IFandElseStatement;

import java.util.Scanner;

class Logical {
  static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to the Ticket Discount Calculator\n ");
   System.out.print("Please Enter your age: ");
   int age = input.nextInt();
   System.out.print("Are you a female? (true/flase): ");
   boolean isfemale = input.nextBoolean();
   if (age <5){
    System.out.println("you got 75% discount ");
   } else if (isfemale) {
    System.out.println("you got 50 % discount");
   } else if (age >60 && !isfemale){
    System.out.println("you got 25% discount ");
   }else{
    System.out.println(" sorry,you got no discount ");
   }
  }
}
